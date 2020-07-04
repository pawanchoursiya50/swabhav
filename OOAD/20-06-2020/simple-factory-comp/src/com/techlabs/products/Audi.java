package com.techlabs.products;

class Audi implements IAuto {

	@Override
	public void start() {
		System.out.println("started Audi");
	}

	@Override
	public void stop() {
		System.out.println("stoped Audi");
		
	}

}
