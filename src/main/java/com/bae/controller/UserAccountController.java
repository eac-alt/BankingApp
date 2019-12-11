package com.bae.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entities.User;
import com.bae.entities.UserService;

@RestController
@RequestMapping("/users")
public class UserAccountController {

	private UserService userService;

	@Autowired
	public UserAccountController(UserService service) {
		super();
		this.userService = service;
	}

	@PostMapping("/createUser")
	public ResponseEntity<List<User>> createUser(@RequestBody List<User> users) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.createUsers(users));
	}

	@PutMapping("/updateUser")
	public User updateUser(@PathParam("id") Long id, @RequestBody User user) {
		return this.userService.updateUser(user, id);
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		this.userService.deleteUser(id);
	}

	@GetMapping("/getAll")
	public List<User> getAll() {
		return this.userService.readUsers();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getAll(@PathVariable Long id) {
		return ResponseEntity.ok(this.userService.findUserByID(id));
	}

}
