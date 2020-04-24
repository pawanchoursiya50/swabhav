package com.techlab.model;

public class Age {

	public void findStage(int age) throws NotAnAge {

		if (age <= 0) {
			
			throw new NotAnAge();
			
		} else if (age <= 2) {
			System.out.println("You are Infancy");

		} else if (age <= 7) {
			System.out.println("You are in Early Childhood");

		} else if (age <= 11) {
			System.out.println("You are in Middle Childhood");

		} else if (age <= 20) {
			System.out.println("You are Adolescence");

		} else if (age <= 50) {
			System.out.println("You are Young Adolescence");

		} else if (age <= 70) {
			System.out.println("You are middle Adolescence");

		} else {
			System.out.println("You are Late Adolescence");

		}
	}
}
