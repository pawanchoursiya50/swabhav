package com.techlab.model;

public class Analyst extends Employee{

	public Analyst(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		double perks = Calculation(30);
		
		netSalary = (perks + basicSalary) * 12;
	}

}
