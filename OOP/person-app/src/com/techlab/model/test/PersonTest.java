package com.techlab.model.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("pawan", 22, "male", 5.6f, 50f);
		printInfo(p1);
		p1.doWorkOut();
		System.out.println("  After workout");
		printInfo(p1);
		p1.doEat();
		System.out.println("  After eating");
		printInfo(p1);

		System.out.println("\n");

		Person p2 = new Person(null, -28, "foo", -5.6f, 50f);
		printInfo(p2);
		p2.doWorkOut();
		System.out.println("  After workout");
		printInfo(p2);
		p2.doEat();
		System.out.println("  After eating");
		printInfo(p2);
	}

	private static void printInfo(Person p) {
		System.out.println("Name = " + p.getName() + "\tAge = " + p.getAge() + "\tGender = " + p.getGender()
				+ "\theigth = " + p.getHeigth() + "\tWeigth = " + p.getWeigth());
	}

}
