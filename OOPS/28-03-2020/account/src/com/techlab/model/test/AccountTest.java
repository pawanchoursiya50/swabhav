package com.techlab.model.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account(101, "pawan", 1000);
		Account a2 = new Account(102, "jay", 200);
		Account a3 = new Account(103, "tanmay", 500);
		Account a4 = new Account(104, "prasad", 2100);
		
		System.out.println("Minimum balance is : "+ Account.getMinimumBalance());
		
		printInfo(a1);
		printInfo(a2);
		
		Account.setMinimumBalance(1000);		
		System.out.println("\nMinimum balance is : "+ Account.getMinimumBalance());
		
		printInfo(a3);
		printInfo(a4);

	}

	private static void printInfo(Account account) {
		System.out.println("\nid is : "+ account.getId());
		System.out.println("name is : "+ account.getName());
		System.out.println("Balance is : "+ account.getBalance());
		
	}
}
