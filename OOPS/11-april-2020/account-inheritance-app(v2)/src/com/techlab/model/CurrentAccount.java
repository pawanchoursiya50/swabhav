package com.techlab.model;

import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNo, String name, double amount, Date creationDate, Date dateofBirth) {
		super(accountNo, name, amount, creationDate, dateofBirth);
	}

	@Override
	public void withdraw(int amt) {
		if (amount - amt >= -5000) {
			amount -= amt;
		}
		
		
	}
	@Override
	public String getAccType() {
		return "Currrent";
	}

}
