package com.techlab.model;

public class Person {

	Vehicle vehicle;
	
	public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void letsDrive() {
		vehicle.drive();
	}
}
