package com.techlabs.factory;

public class Audi implements IAuto {

	@Override
	public void start() {
		System.out.println("Audi start");
	}

	@Override
	public void stop() {
		System.out.println("Audi stop");
	}

}
