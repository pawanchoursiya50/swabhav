package com.techlab.model;

public class CarToy implements Toy{

	@Override
	public void price() {
		System.out.println("Price of CarToy is 150Rs");
	}

	@Override
	public void color() {
		System.out.println("Color of CarToy is Red");
	}

	@Override
	public void move() {
		System.out.println("CarToy can move");
	}

	@Override
	public void fly() {}

}
