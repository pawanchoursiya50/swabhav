package com.techlabs.model;

public class SavingAccount extends Account {

	@Override
	public void withdraw(int amt) {
		try {
			if (amount - amt >= 1000) {
				amount -= amt;
			} else {
				throw new minimumbalance("Can't withdraw that amonut");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
