package com.techlab.arguments;

import java.util.Scanner;

public class SumAndArray {

	public static void main(String[] numbers) {
		
		if (numbers.length == 0) {
			System.err.print("No arguments");
			return;
		}

	//	findSumAndAverage(numbers);
		for (String number : numbers) {
			System.out.print(number + "\t");
		}
		System.out.println("\n");

		
		if (numbers[numbers.length - 1].equals("-even")) {
			calculateEven(numbers);
		} 
		else if(numbers[numbers.length - 1].equals("-odd")) {
			calculateOdd(numbers);
		}
		else if(numbers[numbers.length - 1].equals("-prime")) {
			claculateForPrime(numbers);
		}
		else{
			try {
				Integer.parseInt(numbers[numbers.length - 1]);
				findSumAndAverage(numbers);
			}
			catch (Exception e) {
				System.err.println("Unknow command \nPlease give the correct command");
			}
			
		}

	}

	private static void claculateForPrime(String[] numbers) {
		int sum = 0, avg = 0, count = 0, number;

		for(int i=0; i<numbers.length-1; i++)
		{
			number = Integer.parseInt(numbers[i]);
			
			if(checkPrime(number)) {
				sum += number;
				count++;
			}
		}
		System.out.println("Sum of even numbers is :- " + sum);
		System.out.println("Avg of even numbers is :- " + (double)sum / count);
	}

	private static boolean checkPrime(int number) {
		for(int i=2; i< number; i++ )
		{
			if(number%2 == 0 )
				return false;
		}
			
		return true;
	}

	private static void calculateEven(String[] numbers) {
		int sum = 0, avg = 0, count = 0;
		for (int i = 0; i < numbers.length - 1; i = i++) {
			if( Integer.parseInt(numbers[i])%2  == 0) {
				sum += Integer.parseInt(numbers[i]);
				count++;
			}	
		}

		System.out.println("Sum of even numbers is :- " + sum);
		System.out.println("Avg of even numbers is :- " + (double)sum / count);
	}

	private static void calculateOdd(String[] numbers) {
		int sum = 0, avg = 0, count = 0;
		for (int i = 0; i < numbers.length - 1; i = i++) {
			if( Integer.parseInt(numbers[i])%2  == 1) {
				sum += Integer.parseInt(numbers[i]);
				count++;
			}	
		}

		System.out.println("Sum of odd numbers is :- " + sum);
		System.out.println("Avg of odd numbers is :- " + (double)sum / count);
	}
	
	

	private static void findSumAndAverage(String[] numbers) {
		int sum = 0;

		for (String number : numbers) {
			sum += Integer.parseInt(number);
		}

		System.out.println();

		System.out.println("Sum is :- " + sum);

		System.out.println("Avg of numbers is :- " +(double) sum/(numbers.length));
	}

}
