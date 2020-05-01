package com.techlab.model.test;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> firstFiveEvenNumbers = new ArrayList<>();
		
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		firstFiveEvenNumbers.set(0, 0);
		printInfo(firstFiveEvenNumbers);
		
		List<Integer> firstTenEvenNumber = new ArrayList<>(firstFiveEvenNumbers);
		
		List<Integer> nextFiveEvenNumber = new ArrayList<>();
		nextFiveEvenNumber.add(12);
		nextFiveEvenNumber.add(14);
		nextFiveEvenNumber.add(16);
		nextFiveEvenNumber.add(18);
		nextFiveEvenNumber.add(20);
		
		firstTenEvenNumber.addAll(nextFiveEvenNumber);
		printInfo(firstTenEvenNumber);
		
		if(!firstTenEvenNumber.isEmpty()) {
			firstTenEvenNumber.remove(0);
			firstTenEvenNumber.remove(1);
			firstTenEvenNumber.remove(firstTenEvenNumber.size()-1);
		}
		
		System.out.println("After removing several numbers");
		printInfo(firstTenEvenNumber);
		
		List<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("VOLVO");
		cars.add("FORD");
		cars.add("MERCEDES");
		
		// Iterate through forEach loop
		for(String car : cars) {
			System.out.println(car);
		}
		
	}
	
	private static void printInfo(List<Integer> numbers) {
		System.out.println(numbers);
	}

}
