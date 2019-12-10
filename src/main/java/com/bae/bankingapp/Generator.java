package com.bae.bankingapp;

import java.util.Random;

public class Generator {
	Random rand = new Random();
	public String generatorLetter() {
		switch(rand.nextInt(3)) {
		case (0): return "A";
		case (1): return "B";
		case (2): return "C";
	}
		return "D";
	}
	public int generatorNumber() {
		switch(rand.nextInt(3)) {
		case (0): int a = 1000000000;
				  return (a + rand.nextInt(899999999));
		case (1): int b = 10000000;
				  return (b + rand.nextInt(89999999));
		case (2): int c = 100000;
				  return (c + rand.nextInt(899999));
		default:
			int d = 190;
			return d;
		}
	}
	public static String accountNumber() {
		Generator genLetter = new Generator();
		Generator genNumber = new Generator();
		String accountNumber = genLetter.generatorLetter() + Integer.toString(genNumber.generatorNumber());
		return accountNumber;
	}
}
