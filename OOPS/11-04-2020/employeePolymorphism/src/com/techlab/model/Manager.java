package com.techlab.model;

public class Manager extends Employee{

	public Manager(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		double hra = Calculation(50);
		double tr = Calculation(40);
		double da = Calculation(30);
		
		netSalary = (hra + tr + da + basicSalary) * 12;
	}

	
}
