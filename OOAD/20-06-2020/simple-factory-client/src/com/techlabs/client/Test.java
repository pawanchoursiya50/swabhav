package com.techlabs.client;

import com.techlabs.products.AutoMobileFactory;
import com.techlabs.products.AutoType;
import com.techlabs.products.IAuto;

public class Test {

	public static void main(String[] args) {
		AutoMobileFactory factory = AutoMobileFactory.getInstance();
		IAuto auto = factory.make(AutoType.BMW);
		
		System.out.println(auto.getClass().getSimpleName());
		
		auto.start();
		auto.stop();
	}

}
