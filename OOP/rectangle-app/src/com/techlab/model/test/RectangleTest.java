package com.techlab.model.test;

import com.techlab.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle small = new Rectangle();
		small.width = 10;
		small.heigth = 5;

		Rectangle big = new Rectangle();
		big.width = 100;
		big.heigth = 50;

		int smallArea = small.calculateArea();
		int bigArea = big.calculateArea();

		System.out.println("width :- " + small.width + "  heigth :- " + small.heigth);
		System.out.println("Area of small rectangle is :- " + smallArea);

		System.out.println("\nwidth :- " + big.width + "  heigth :- " + big.heigth);
		System.out.println("Area of big rectangle is :- " + bigArea);

	}

}
