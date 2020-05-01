package com.techlab.model;

public class Account {

	private int accNo;
	private String name;
	private int balance;
	
	public Account(int accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void withDraw(int amt) {
		if(balance < amt) {
			throw new RuntimeException("you don,t have sufficiet balance");
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
	
	
}
