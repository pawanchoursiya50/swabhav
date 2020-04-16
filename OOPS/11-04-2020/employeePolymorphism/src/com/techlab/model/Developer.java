package com.techlab.model;

public class Developer extends Employee {

	public Developer(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		double pa = Calculation(40);
		double bonus = Calculation(30);
		
		netSalary = (pa + bonus + basicSalary) * 12;
	}

	
}
