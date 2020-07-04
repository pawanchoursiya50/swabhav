package com.techlabs.model;

public class CurrentAccount extends Account {

	public CurrentAccount() {
	}

	@Override
	public void withdraw(int amt) {
		try {
			if (amount - amt >= 0) {
				amount -= amt;
			} else {
				throw new RuntimeException("Can't withdraw that amonut");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
