package com.techlab.model.test;

import com.techlab.model.Person;

public class pawanTest {

	public static void main(String[] args) {
		
		Person pawan = new Person("pawan", (float)22.0, (float)23.5);
		printInfo(pawan);
	}
	
	private static void printInfo(Person p) {
		System.out.println("Name = "+ p.getName());
		System.out.println("Age = "+ p.getAge());
		System.out.println("Weight = "+ p.getWeight());
		System.out.println("number of legs = "+ p.getNumberOfLegs());
		System.out.println("number of hands = "+ p.getNumberOfHands());

	}

}
