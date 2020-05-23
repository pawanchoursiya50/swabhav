package com.techlab.model;

public class Person {

	Scoda scoda;
	
	public Person(Scoda scoda) {
		this.scoda = scoda;
	}
	
	public void letsDrive() {
		scoda.drive();
	}
}
