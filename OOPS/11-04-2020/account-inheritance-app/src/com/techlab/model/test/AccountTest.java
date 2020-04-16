package com.techlab.model.test;

import com.techlab.model.*;

public class AccountTest {

	public static void main(String[] args) {

		System.out.println("~~~~~For Saving account~~~~~");
		SavingAccount sAcc = new SavingAccount(101, "pawan", 1000);
		printInfo(sAcc);
		sAcc.deposite(3000);
		System.out.println("Amount = " + sAcc.getAmount());
		sAcc.withdraw(2000);
		System.out.println("Amount = " + sAcc.getAmount());

		System.out.println("~~~~~For Current account~~~~~");
		CurrentAccount cAcc = new CurrentAccount(102, "pankaj", 2000);
		printInfo(cAcc);
		cAcc.deposite(3000);
		System.out.println("Amount = " + cAcc.getAmount());
		cAcc.withdraw(8000);
		System.out.println("Amount = " + cAcc.getAmount());

	}

	private static void printInfo(Account acc) {
		System.out.println("Account no. = " + acc.getAccount());
		System.out.println("Name = " + acc.getName());
		System.out.println("Amount = " + acc.getAmount());
	}

}
