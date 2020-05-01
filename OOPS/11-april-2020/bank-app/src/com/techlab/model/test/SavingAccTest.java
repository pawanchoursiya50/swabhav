package com.techlab.model.test;

import com.techlab.model.SavingAccount;
public class SavingAccTest {

	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount(101, "pawan", (double)1000);
		
		printInfo(acc);
		
		acc.deposit(3000);
		System.out.println("Amount = "+ acc.getAmount());
		
		acc.withDraw(1500);
		System.out.println("Amount = "+ acc.getAmount());
	}

	private static void printInfo(SavingAccount acc) {
		System.out.println("Account no. = "+ acc.getAcc());
		System.out.println("Name = "+ acc.getName());
		System.out.println("Amount = "+ acc.getAmount());
	}

}
