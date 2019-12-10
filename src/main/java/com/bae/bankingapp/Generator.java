package com.bae.bankingapp;

import java.util.Random;

public class Generator {
	Random rand = new Random();

	public String generatorLetter() {
		switch (rand.nextInt(3)) {
		case (0):
			return "A";
		case (1):
			return "B";
		case (2):
			return "C";
		}
		return "D";
	}

	public int generatorNumber() {

		int account = 0;
		switch (rand.nextInt(3)) {
		case (0):
			int a = 1000000000;
			account = (a + rand.nextInt(899999999));
			return account;
		case (1):
			int b = 10000000;
			account = (b + rand.nextInt(89999999));
			return account;
		case (2):
			int c = 100000;
			account = (c + rand.nextInt(899999));
			return account;
		}
		return account;
	}

	public static String accountNumber() {
		Generator genLetter = new Generator();
		Generator genNumber = new Generator();
		String accountNumber = genLetter.generatorLetter() + Integer.toString(genNumber.generatorNumber());
		return accountNumber;
	}
}
