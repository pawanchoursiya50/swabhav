package com.techlabs.factory;

public class BMW implements IAuto {

	@Override
	public void start() {
		System.out.println("BMW start");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop");
	}

}
