package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceListener;

public class EmailListener implements IBalanceListener {

	@Override
	public void update(Account acc) {
		System.out.println("Inside Email listener");
		System.out.println("Balance changed to "+acc.getBalance()+" for "+acc.getName());
	}

}
