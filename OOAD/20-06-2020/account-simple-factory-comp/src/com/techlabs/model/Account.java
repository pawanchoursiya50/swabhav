package com.techlabs.model;

public abstract class Account {
	protected int accountNo;
	protected String name;
	protected double amount;
	
	public void deposite(int amt) {
		amount += amt;
	}

	public abstract void withdraw(int amt);
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAcctNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		this.amount = this.amount + amount;
	}
	
}
