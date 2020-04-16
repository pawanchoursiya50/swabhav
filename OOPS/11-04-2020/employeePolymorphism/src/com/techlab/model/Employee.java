package com.techlab.model;

public abstract class Employee {
	
	protected int id;
	protected String name;
	protected double basicSalary;
	protected String gender;
	protected double netSalary;
	
	
	public Employee(int id, String name, double basicSalary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}
	
	public abstract void calculateNetSalay();

	public double Calculation(int percent) {
		
		return (percent * basicSalary) / 100;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public String getGender() {
		return gender;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	
	
	
}
