package com.techlab.model.test;

import com.techlab.model.Addition;
import com.techlab.model.Calculater;
import com.techlab.model.Multiplication;
import com.techlab.model.Subtraction;

public class CalculaterTest {

	public static void main(String[] args) {

		Calculater cal = new Calculater();
		
		cal.performCalculation(new Addition());
		cal.performCalculation(new Subtraction());
		cal.performCalculation(new Multiplication());
	}

}
