package com.bae.entities;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CreateUsersUnitTest {
	
	@InjectMocks
	private UserService service;
	
	@Mock
	private UserRepo repo;
	
	@Test
	public void readAllUsersTest() {
		List<User> accounts = new ArrayList<>();
	}

}
