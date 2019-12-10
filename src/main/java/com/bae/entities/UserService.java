package com.bae.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.bankingapp.PrizeLogicService;

@Service
public class UserService {
	
	private UserRepo repo;
	private PrizeLogicService service;

	@Autowired
	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}
	
	public User createUser(User user) {
		user.setAccountNumber(service.accountNumber());
		user.setWinnings(service.genPrize(user.getAccountNumber()));
		return this.repo.save(user);
	}
	
	public List<User> readUsers(){
		return this.repo.findAll();
	}
	
	public User updateUser(User user, Long id) {
		User toUpdate = this.repo.getOne(id);
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
