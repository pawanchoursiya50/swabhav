package com.techlab.model;

public class SavingAccount {

	private int acc;
	private double amount;
	private String name;
	
	public SavingAccount(int acc, String name, Double amount) {
		this.acc = acc;
		this.amount = amount;
		this.name = name;
	}
	
	public void deposit(int amt) {
		amount += amt;
	}
	
	public void withDraw(int amt) {
		if(amount-amt >= 1000) {
			amount -= amt;
		}
	}

	public int getAcc() {
		return acc;
	}

	public double getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}
	
	
}
