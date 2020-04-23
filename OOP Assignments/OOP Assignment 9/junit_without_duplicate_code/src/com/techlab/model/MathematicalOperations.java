package com.techlab.model;

public class MathematicalOperations {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		
		if (a > b) {
			return a - b;
		}
		return b - a;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		
		if (a > b) {
			return a / b;
		}
		return b / a;
	}
}
