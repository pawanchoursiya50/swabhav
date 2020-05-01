package com.techlab.model;

import java.util.Date;

public abstract class Person {

	protected int id ;
	protected String address ;
	protected Date dob ;
	
	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Date getDob() {
		return dob;
	}
}
