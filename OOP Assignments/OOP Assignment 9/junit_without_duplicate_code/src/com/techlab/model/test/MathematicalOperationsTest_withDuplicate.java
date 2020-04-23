package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.MathematicalOperations;

class MathematicalOperationsTest_withDuplicate {

	@Test
	void test_addition_with_10_20return_30() {
		MathematicalOperations math = new MathematicalOperations();
		
		assertEquals(30, math.addition(10, 20) );
	}
	
	@Test
	void test_subtraction_20_from50_return_30() {
		MathematicalOperations math = new MathematicalOperations();
		
		assertEquals(30, math.subtraction(20, 50) );
	}
	
	@Test
	void test_multiplication_with_20_3return_60() {
		MathematicalOperations math = new MathematicalOperations();
		
		assertEquals(60, math.multiplication(3, 20) );
	}
	
	@Test
	void test_division_20by_10return_2() {
		MathematicalOperations math = new MathematicalOperations();
		
		assertEquals(2, math.division(10, 20) );
	}

}
