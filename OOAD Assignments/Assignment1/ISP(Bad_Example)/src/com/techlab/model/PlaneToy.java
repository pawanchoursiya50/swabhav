package com.techlab.model;

public class PlaneToy implements Toy {

	@Override
	public void price() {
		System.out.println("Price of CarToy is 200Rs");
	}

	@Override
	public void color() {
		System.out.println("Color of CarToy is White");
	}

	@Override
	public void move() {
		System.out.println("PlaneToy can move");
	}
	
	@Override
	public void fly() {
		System.out.println("PlaneToy can fly");
	}
}
