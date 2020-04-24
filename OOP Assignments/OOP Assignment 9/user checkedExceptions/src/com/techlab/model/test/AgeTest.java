package com.techlab.model.test;

import com.techlab.model.Age;
import com.techlab.model.NotAnAge;

public class AgeTest {

	public static void main(String[] args) {

		Age age = new Age();
		
		try {
			age.findStage(50);
		}
		catch(NotAnAge e) {
			
			System.out.println(e);
		}
	}

}
