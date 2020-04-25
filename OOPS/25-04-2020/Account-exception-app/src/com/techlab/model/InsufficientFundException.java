package com.techlab.model;

public class InsufficientFundException extends RuntimeException {

	Account acc;
	int withdrowAmt;

	public InsufficientFundException(Account acc, int amt) {
		this.acc = acc;
		this.withdrowAmt = amt;
	}
	
	public Account getAcc() {
		return acc;
	}
	
	public int getWithdrowAmt() {
		return withdrowAmt;
	}
	
	
	
}
