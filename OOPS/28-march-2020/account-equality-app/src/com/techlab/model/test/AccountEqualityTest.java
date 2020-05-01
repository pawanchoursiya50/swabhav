package com.techlab.model.test;

import com.techlab.model.Account;

public class AccountEqualityTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account(101, "pawan", 1000);
		Account acc2 = new Account(101, "pawan", 1000);
		
		//case 1:
		Account acc3 = acc1;
		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2);
		System.out.println(acc1 == acc3);
		
		//case 2:
		System.out.println("\n");
		
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
		
		
	}

}
