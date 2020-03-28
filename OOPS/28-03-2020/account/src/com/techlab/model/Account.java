package com.techlab.model;

public class Account {
	
	private int id;
	private String name;
	private int balance;
	private static int MINIMUM_BALANCE;
	
	
	static {
		MINIMUM_BALANCE = 500;
	}
	
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}
	
	public void withDraw(int amt) {
		if(balance-amt <=  500) {
			balance -= amt;
		}
	}
	
	public void deposit(int amt) {
		balance += amt;
	}
	
	public static int getMinimumBalance() {
		return MINIMUM_BALANCE;
	}
	
	public static void setMinimumBalance( int amt) {
		MINIMUM_BALANCE = amt;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}


}
