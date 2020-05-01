package com.techlab.model;

public class CurrentAccount {

	private int acc;
	private double amount;
	private String name;
	
	public CurrentAccount(int acc, String name, Double amount) {
		this.acc = acc;
		this.amount = amount;
		this.name = name;
	}
	
	public void deposit(int amt) {
		amount += amt;
	}
	
	public void withDraw(int amt) {
		if(amount-amt >= -5000) {
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
