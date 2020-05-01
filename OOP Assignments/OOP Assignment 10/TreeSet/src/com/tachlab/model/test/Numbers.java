package com.tachlab.model.test;

import java.util.TreeSet;

public class Numbers {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet();
		
		//Entering numbers in random orders
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(5);
		numbers.add(4);
		printInfo(numbers);
		
		//It does not accept duplicate values
		System.out.println( numbers.add(3) );
		
		System.out.println("Total numbers are ::- "+ numbers.size());

		//Removed all elements
		numbers.clear();
		printInfo(numbers);
	}

	private static void printInfo(TreeSet<Integer> numbers) {

		System.out.println(numbers);
	}

}
