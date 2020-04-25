package com.techlab.model.test;

import com.techlab.model.Account;

public class Test {

	public static void main(String[] args) {

		Account acc = new Account(101, "joy", 1000);
		
		try {
			acc.withDraw(6000);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End main");
	}
}
