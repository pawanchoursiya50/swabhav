package com.techlabs.model;

public class AccountFactory {

	private static AccountFactory bucket;
	private AccountFactory() {}
	
	public static AccountFactory getInstance() {
		if(bucket == null) {
			bucket = new AccountFactory();
		}
		return bucket;
	}
	
	public Account make(AccType type) {
		if(type == AccType.SA) {
			return new SavingAccount();
		}
		else {
			return new CurrentAccount();
		}
	}
	
}
