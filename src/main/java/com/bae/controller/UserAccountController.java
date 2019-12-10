package com.bae.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entities.User;
import com.bae.entities.UserService;

@RestController
public class UserAccountController {
	
	private UserService userService;
	
	@Autowired
	public UserAccountController(UserService service) {
		super();
		this.userService = service;
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return this.userService.createUser(user);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@PathParam("id") Long id, @RequestBody User user) {
		return this.userService.updateUser(user, id);				
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@PathVariable Long id) {
			this.userService.deleteUser(id);
	}
	
	@GetMapping("/getAll")
	public List<User> getAll() {
			return this.userService.readUsers();
			
			
	}
	
}
