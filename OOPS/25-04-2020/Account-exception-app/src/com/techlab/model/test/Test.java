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
			
			Account acc =  obj.getAcc();
			System.out.println("Account holder "+acc.getAccNo() +", Named "+acc.getName() );
			System.out.println("you have "+ acc.getBalance() +" balance but he tried to withdraw "+ obj.getWithdrowAmt());
			System.out.println("But your minimum balance has to maintain "+ acc.getMINIMUM_BAL());
			System.out.println("So the bank is not allowing you for that and Transaction has declined");
		}
		
		System.out.println("\nEnd main");
	}
}
