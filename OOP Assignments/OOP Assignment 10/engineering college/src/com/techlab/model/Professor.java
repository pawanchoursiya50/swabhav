package com.techlab.model;

import java.util.Date;

public class Professor extends Person{

	private double basicSalary;

	public Professor(int id, String address, Date dob, double basicSalary) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.basicSalary = basicSalary;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double calculateNetSalary() {
		return basicSalary * 12;
	}
}
