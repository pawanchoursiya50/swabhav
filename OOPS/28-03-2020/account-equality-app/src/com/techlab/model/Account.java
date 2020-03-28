package com.techlab.model;

public class Account {
	
	private int id;
	private String name;
	private int balance;
	private static int MINIMUM_BALANCE;
	private static int totalTrasactions;
	
	
	static {
		MINIMUM_BALANCE = 500;
	}
	
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}
	
	public void withDraw(int amt) {
		if(balance-amt >=  500) {
			balance -= amt;
			
			totalTrasactions++;
		}
	}
	
	public void deposit(int amt) {
		balance += amt;
		
		totalTrasactions++;
	}
	
	
//	@Override
//	public String toString() {
//		String result;
//		String parentResult = "\n"+ new Object().toString();
//		
//		result = "\nid is : " +this.id+ "\nname is : " +this.name+ "\nBalance is : " +this.balance;
//		
//		return parentResult+result;
//	}
	
	@Override
	public String toString() {
		String result = values(this);
		
		String parentResult = super.toString();
		
		return "\n"+ parentResult+result;
	}
	
	public String values(Account a) {
		return "\nid is : " +a.id+ "\nname is : " +a.name+ "\nBalance is : " +a.balance;

	}
	
	public boolean equals(Account acc) {
		if(values(this).equalsIgnoreCase(values(acc))) {
			return true;
		}
		return false;
	}
	
	public static int getMinimumBalance() {
		return MINIMUM_BALANCE;
	}
	
	public static void setMinimumBalance( int balance) {
		MINIMUM_BALANCE = balance;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public static int getTotalTrasactions() {
		return totalTrasactions;
	}

}
