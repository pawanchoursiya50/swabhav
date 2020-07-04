package com.techlabs.products;

class BMW implements IAuto {

	@Override
	public void start() {
		System.out.println("started BMW");
	}

	@Override
	public void stop() {
		System.out.println("stoped BMW");
		
	}

}
