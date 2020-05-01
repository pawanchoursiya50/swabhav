package com.techlab.model;

import java.util.Date;

public class Student extends Person{

	private String branch;
	
	public Student(int id, String address, Date dob, String branch) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public String getBranch() {
		return branch;
	}
	
	
	
}
