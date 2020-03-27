package com.techlab.model.test;

import com.techlab.model.Rectangle;

public class RectangleRefTest {

	public static void main(String[] args) {
		 
		Rectangle small = null; //Expecting an object
		System.out.println(small);
		
		small = new Rectangle();
		System.out.println(small); //Giving the hash code
		System.out.printf("\nWidth = %d,  Heigth = %d,  Area = %d \n\n",small.width,small.heigth,small.calculateArea());

		small.width = 100000; //violation of exception
		small.heigth = -50;
		System.out.printf("Width = %d,  Heigth = %d,  Area = %d",small.width,small.heigth,small.calculateArea());

		
		
	}

}
