package com.test.model.test;

import com.test.model.NumberProvider;

public class Mathematics implements INumberProvider {

	public static void main(String[] args) {

		int factorial = findFactorial(FACTORIAL_OF);
		printinfo("factorial", FACTORIAL_OF, factorial);
		
		int square = findSquare(SQURE_OF);
		printinfo("square", SQURE_OF, square);
	}

	private static int findFactorial(int FACTORIAL_OF) {
		
		int result = 1;
		for(int i=1; i<= FACTORIAL_OF; i++) {
			result = result * i;
		}
		return result;

	}

	private static int findSquare(int squreOf) {
		
		return squreOf * squreOf;
	}

	private static void printinfo(String operation, int number, int result) {
		System.out.println(operation +" of "+ number +" : "+ result);
	}
}
