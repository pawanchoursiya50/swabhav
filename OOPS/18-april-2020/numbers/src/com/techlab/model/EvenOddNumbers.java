package com.techlab.model;

import com.techlab.model.test.Choices;

public class EvenOddNumbers {

	public int[] getEvenNumbers(int limit) {

		int[] numbers = new int[limit / 2];
		int j = 0;
		
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				numbers[j] = i;
				j++;
			}
		}
		return numbers;
	}

	public int[] getOddNumbers(int limit) {

		int[] Numbers = new int[limit / 2];
		int j = 0;
		for (int i = 1; i <= limit; i++) {
			if (i % 2 != 0) {
				Numbers[j] = i;
				j++;
			}
		}
		return Numbers;
	}

	public int[] getNumbers(Choices choice, int end) {
		int start = 1;
		if (choice == Choices.even) {
			start = 2;
		}
		int[] result = new int[end / 2];
		int possition = 0;

		while (start <= end) {

			result[possition] = start;
			start += 2;
			possition++;
		}
		return result;
	}
}
