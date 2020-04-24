package com.techlab.model;

public class NotAnAge extends Exception{

	public NotAnAge() {
		super("Age can't be zero or negative");
	}
}
