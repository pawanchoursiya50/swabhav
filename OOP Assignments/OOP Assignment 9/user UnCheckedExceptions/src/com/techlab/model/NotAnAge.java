package com.techlab.model;

public class NotAnAge extends RuntimeException{

	public NotAnAge() {
		super("Age can't be zero or negative");
	}
}
