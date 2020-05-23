package com.techlab.model;

public class HouseToy implements Toy{

	@Override
	public void price() {
		System.out.println("Price of HouseToy is 100Rs");
	}

	@Override
	public void color() {
		System.out.println("Color of HouseToy is Red");
	}

	@Override
	public void move() {}

	@Override
	public void fly() {}

}
