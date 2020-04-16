package com.techlab.model;

public abstract class Account {
	protected int account;
	protected String name;
	protected double amount;
	
	public Account(int account, String name, double amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	public void deposite(int amt) {
		amount += amt;
	}

	public abstract void withdraw(int amt);
	
	
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}
	
	
	
	
}
