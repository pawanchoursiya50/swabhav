package com.techlab.model;

public class CurrentAccount extends Account{

	public CurrentAccount(int account, String name, double amount) {
		super(account, name, amount);
	}

	@Override
	public void withdraw(int amt) {
		if(amount - amt >= -5000) {
			amount -= amt;
		}
	}
	
	
}
