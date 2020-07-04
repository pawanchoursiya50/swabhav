package com.techlabs.subscriber;

import com.techlabs.publisher.Account;

public class Test {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "pawan", 1000);
		
		acc1.addListener(new SMSListener());
		acc1.addListener(new EmailListener());
		
		acc1.deposite(5000);
	}

}
