package com.techlab.model;

public class Account {

	private int accNo;
	private String name;
	private int balance;
	private int MINIMUM_BAL = 500;
	
	public Account(int accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void withDraw(int amt){
		if(balance-MINIMUM_BAL < amt) {
			throw new InsufficientFundException(this, amt);
		}
		balance -= amt;
	}
	
	public void deposite(int amt) {
		balance += amt;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public int getMINIMUM_BAL() {
		return MINIMUM_BAL;
	}
	
	
}
