package com.techlab.model;

import java.util.Date;

public class SavingAccount extends Account{

	public SavingAccount(int accountNo, String name, double amount, Date creationDate, Date dateofBirth) {
		super(accountNo, name, amount, creationDate, dateofBirth);
	}
	
	@Override
	public void withdraw(int amt) {
		if(amount - amt >= 1000) {
			amount -= amt;
		}
	}
	
	@Override
	public String getAccType() {
		return "Saving";
	}
	
	
}
