package com.bae.bankingapp;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PrizeLogicService {

	public int genPrize(String accountNumber) {
		int prizeMoney = 0;
		String firstLetter = "" + accountNumber.charAt(0);
		int accountNumberLength = accountNumber.length();
		if (accountNumberLength != 7 && accountNumberLength != 9 && accountNumberLength != 11) {
			throw new IllegalStateException(
					"Check accountNumber length.  Account numbers should be one letter and 6, 8, 10 digit number.");
		} else {
			switch (firstLetter) {
			case "a":
				prizeMoney = 0;
				break;
			case "b":
				switch (accountNumberLength) {
				case 7:
					prizeMoney = 50;
					break;
				case 9:
					prizeMoney = 500;
					break;
				case 11:
					prizeMoney = 5000;
					break;
				}
				break;
			case "c":
				switch (accountNumberLength) {
				case 7:
					prizeMoney = 100;
					break;
				case 9:
					prizeMoney = 750;
					break;
				case 11:
					prizeMoney = 10000;
					break;
				}
				break;
			default:
				throw new IllegalStateException("Unexpected value at start of account number: " + firstLetter
						+ "/n account number must start with a, b, c");
			}
		}
		return prizeMoney;
	}

	Random rand = new Random();

	public String generatorLetter() {
		switch (rand.nextInt(3)) {
		case (0):
			return "a";
		case (1):
			return "b";
		case (2):
			return "c";
		}
		return null;
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

	public String accountNumber() {
		String accountNumber = this.generatorLetter() + this.generatorNumber();
		return accountNumber;
	}

}
