package com.techlab.model.test;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> animals = new Vector<String>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Elephant");
		System.out.println("Total no. of animanls are " + animals.size());
		animals.add("Camel");
		animals.add("Geraffe");
		animals.add("Gorilla");
		animals.add("Leopard");
		animals.add("Rabit");

		System.out.println("Total no. of animanls are " + animals.size() + "\n" + animals);

		if (animals.contains("Lion")) {
			System.out.println("Lion present at index " + animals.indexOf("Lion"));
		} else {
			System.out.println("Lion not present in the list");
		}

		System.out.println(animals.elementAt(5));
		System.out.println(animals.get(5));

		animals.remove(5); //remove by index
		animals.remove("Dog"); //remove by value

		System.out.println(animals);
		
		animals.add(0, "Deer");
		System.out.println(animals);

	}

}
