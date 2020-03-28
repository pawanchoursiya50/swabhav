package com.techlab.model;

public class Person {
	private static int numberOfLegs;
	private static int NumberOfHands;
	private String name;
	private float age;
	private float weight;
	
	
	static {
		numberOfLegs = 2;
		NumberOfHands = 2;
		
		System.out.println("static block runs before the constructer");
	}
	
	public Person(String name, float age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public static int getNumberOfLegs() {
		return numberOfLegs;
	}

	public static int getNumberOfHands() {
		return NumberOfHands;
	}

	public String getName() {
		return name;
	}

	public float getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	
	
}
