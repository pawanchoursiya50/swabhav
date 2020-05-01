package com.techlab.model.test;

import com.techlab.model.EvenOddNumbers;

public class EvenOddTest {

	public static void main(String[] args) {

		EvenOddNumbers obj = new EvenOddNumbers();
		
		int[] evenNumbers = obj.getEvenNumbers(100);
		printNumbers(evenNumbers);
		
		int[] oddNumbers = obj.getOddNumbers(100);
		printNumbers(oddNumbers);
	}

	private static void printNumbers(int[] numbers) {
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}



}
