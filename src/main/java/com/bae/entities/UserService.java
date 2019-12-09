package com.bae.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private UserRepo repo;

	@Autowired
	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}
	
	public User createUser(User user) {
		return this.repo.save(user);
	}
	
	public List<User> readUsers(){
		return this.repo.findAll();
	}
	
	public User updateUser(User user, Long id) {
		User toUpdate = this.repo.getOne(id);
		toUpdate.setForename(user.getForename());
		toUpdate.setSurname(user.getSurname());
		toUpdate.setWinnings(user.getWinnings());
		return this.repo.save(toUpdate);
		}
	
	public User findUserByID(Long id) {
		return this.repo.findById(id).orElseThrow(() -> new UserNotFoundException());
	}
	
	public void deleteUser(Long id) {
		this.repo.deleteById(id);
	}
	
	


}
