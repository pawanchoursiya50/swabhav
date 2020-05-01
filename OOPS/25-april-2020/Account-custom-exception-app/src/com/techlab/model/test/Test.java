package com.techlab.model.test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientFundException;

public class Test {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "pawan", 1000);
		
		try {
			acc1.withDraw(600);
			System.out.println("Transaction successful");

		}
		catch (InsufficientFundException obj) {
			
			System.out.println(obj.getMessage());
			
		}
		
		System.out.println("\nEnd main");
	}
}
