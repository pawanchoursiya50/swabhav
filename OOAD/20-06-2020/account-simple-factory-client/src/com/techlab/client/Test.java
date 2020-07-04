package com.techlab.client;

import com.techlabs.model.AccType;
import com.techlabs.model.Account;
import com.techlabs.model.AccountFactory;

public class Test {

	public static void main(String[] args) {

		AccountFactory factory = AccountFactory.getInstance();

		Account acc = factory.make(AccType.SA);
		acc.setAcctNo(101);
		acc.setName("abc");
		acc.deposit(10000);

		acc.withdraw(100000);
		acc.withdraw(8000);
		printInfo(acc);

		Account acc2 = factory.make(AccType.CA);
		acc2.setAcctNo(101);
		acc2.setName("abc");
		acc2.deposit(10000);

		acc2.withdraw(100000);
		printInfo(acc2);

	}

	private static void printInfo(Account acc) {
		System.out.println("Acc no : " + acc.getAccountNo());
		System.out.println("Name : " + acc.getName());
		System.out.println("Balance : " + acc.getAmount() + "\n");
	}

}
