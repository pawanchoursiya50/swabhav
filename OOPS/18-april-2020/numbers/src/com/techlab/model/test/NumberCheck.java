package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.EvenOddNumbers;

class NumberCheck {

	@Test
	void test_Odd_Even_Number() {
		int[] result;
		
		EvenOddNumbers number = new EvenOddNumbers();
		
		result = number.getEvenNumbers(100);
		
		assertArrayEquals(number.getNumbers(Choices.even, 100), result);
		
		
		result = number.getOddNumbers(100);
		
		assertArrayEquals(number.getNumbers(Choices.odd, 100), result);

	}

}
