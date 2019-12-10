package com.bae.bankingapp;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
		System.out.println(Generator.accountNumber());
	}
	
}
