package com.techlab.model.test;

import com.techlab.model.Hyundai;
import com.techlab.model.Person;
import com.techlab.model.Scoda;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person(new Scoda());
		person.letsDrive();
		
		Person person2 = new Person(new Hyundai());
		person2.letsDrive();
	}

}
