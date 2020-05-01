package com.techlab.model;

public class InsufficientFundException extends RuntimeException {

	Account acc;
	int withdrowAmt;

	public InsufficientFundException(Account acc, int amt) {
		this.acc = acc;
		this.withdrowAmt = amt;
	}
	
	public String getMessage() {
		String str1 = "Account holder "+acc.getAccNo() +", Named "+acc.getName();
		String str2 = "\nyou have "+ acc.getBalance() +" balance but he tried to withdraw "+ withdrowAmt;
		String str3 = "\nBut your minimum balance has to maintain "+ acc.getMINIMUM_BAL();
		String str4 = "\nSo the bank is not allowing you for that and Transaction has declined";
		
		return str1 + str2 + str3 + str4;
		
	}
	public Account getAcc() {
		return acc;
	}
	
	public int getWithdrowAmt() {
		return withdrowAmt;
	}
	
	
	
}
