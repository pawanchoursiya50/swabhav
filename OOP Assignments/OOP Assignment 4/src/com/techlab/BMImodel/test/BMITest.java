package com.techlab.BMImodel.test;

import com.techlab.BMImodel.BMI;

public class BMITest {

	public static void main(String[] args) {

		BMI person1 = new BMI(55, 5.6);
		System.out.println(person1.catagory());

		BMI person2 = new BMI(60, 6);
		System.out.println(person2.catagory());

		BMI person3 = new BMI(80, 5.7);
		System.out.println(person3.catagory());

		BMI person4 = new BMI(95, 7);
		System.out.println(person4.catagory());
	}

}
