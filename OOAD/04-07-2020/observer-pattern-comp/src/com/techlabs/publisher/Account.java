package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int acc;
	private String name;
	private double balance;
	private List<IBalanceListener> listeners = new ArrayList<IBalanceListener>();

	public Account(int acc, String name, double balance) {
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double balance) {
		this.balance += balance;
		callUpdate();
	}

	public void withdraw(double balance) {
		if (this.balance - balance >= 500) {
			this.balance -= balance;
			callUpdate();
		}
	}

	public void callUpdate() {
		for (IBalanceListener listener : listeners) {
			listener.update(this);
		}
	}

	public void addListener(IBalanceListener listener) {
		this.listeners.add(listener);
	}

	public int getAcc() {
		return acc;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceListener> getListner() {
		return listeners;
	}

}
