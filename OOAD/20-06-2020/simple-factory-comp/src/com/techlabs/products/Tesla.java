package com.techlabs.products;

class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("started Tesla");
	}

	@Override
	public void stop() {
		System.out.println("stoped Tesla");
		
	}

}
