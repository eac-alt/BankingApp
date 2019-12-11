package com.bae.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String forename;
	
	private String surname;
	
	private String accountNumber;
	
	private int winnings;
	
	public User() {
		
	}
	
	public User(String forename, String surname) {
		super();
		this.forename = forename;
		this.surname = surname;
	}

	public int getWinnings() {
		return winnings;
	}

	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", forename=" + forename + ", surname=" + surname + ", accountNumber=" + accountNumber
				+ ", winnings=" + winnings + "]";
	}
	
	

}
