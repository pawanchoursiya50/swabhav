package com.techlab.model;

public class SavingAccount extends Account{

	public SavingAccount(int account, String name, double amount) {
		super(account, name, amount);
	}
	
	@Override
	public void withdraw(int amt) {
		if(amount - amt >= 1000) {
			amount -= amt;
		}
	}
	
	
}
