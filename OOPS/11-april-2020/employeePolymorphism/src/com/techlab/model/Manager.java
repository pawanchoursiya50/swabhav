package com.techlab.model;

public class Manager extends Employee{
	
	private double hra;
	private double tr;
	private double da;

	public Manager(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		hra = Calculation(50);
		tr = Calculation(40);
		da = Calculation(30);
		
		netSalary = (hra + tr + da + basicSalary) * 12;
	}

	@Override
	public String getSalaryDetails() {
		return "hra : "+hra+ ", tr : "+tr+ ", da : "+da;
	}

	
}
