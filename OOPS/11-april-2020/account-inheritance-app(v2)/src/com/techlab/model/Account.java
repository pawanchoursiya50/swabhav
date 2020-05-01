package com.techlab.model;

import java.util.Date;

public abstract class Account {
	protected int accountNo;
	protected String name;
	protected double amount;
	protected Date creationDate;
	protected Date dateofBirth;
	
	public Account(int accountNo, String name, double amount, Date creationDate, Date dateofBirth) {
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
		this.creationDate = creationDate;
		this.dateofBirth = dateofBirth;
	}
	
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

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}
	
	public abstract String getAccType();

	
}
