package com.techlab.model.test;

import com.techlab.model.CurrentAccount;

public class CurrentAccTest {

	public static void main(String[] args) {
		CurrentAccount acc = new CurrentAccount(101, "pankaj", (double)1000);
		
		printInfo(acc);
		
		acc.deposit(3000);
		System.out.println("Amount = "+ acc.getAmount());
		
		acc.withDraw(7000);
		System.out.println("Amount = "+ acc.getAmount());
	}

	private static void printInfo(CurrentAccount acc) {
		System.out.println("Account no. = "+ acc.getAcc());
		System.out.println("Name = "+ acc.getName());
		System.out.println("Amount = "+ acc.getAmount());
	}

}
