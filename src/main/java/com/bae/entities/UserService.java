package com.bae.entities;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.bankingapp.PrizeLogicService;

@Service
public class UserService {

	private UserRepo repo;
	private PrizeLogicService service;

	@Autowired
	public UserService(UserRepo repo, PrizeLogicService service) {
		super();
		this.repo = repo;
		this.service = service;
	}
	
	private User createUser(User user) {
		String num;
		do {
			num = service.accountNumber();
		} while (this.repo.existsByAccountNumber(num));
		user.setAccountNumber(num);
		user.setWinnings(service.genPrize(user.getAccountNumber()));
		return this.repo.save(user);
	}

	public List<User> createUsers(List<User> users) {
		return users.stream().map(this::createUser).collect(Collectors.toList());
	}

	public List<User> readUsers() {
		return this.repo.findAll();
	}

	public User updateUser(User user, Long id) {
		User toUpdate = this.findUserByID(id);
		toUpdate.setForename(user.getForename());
		toUpdate.setSurname(user.getSurname());
		return this.repo.save(toUpdate);
	}

	public User findUserByID(Long id) {
		return this.repo.findById(id).orElseThrow(() -> new UserNotFoundException());
	}

	public void deleteUser(Long id) {
		this.repo.deleteById(id);
	}

}
