package com.techlab.model;

public class Analyst extends Employee{

	private double perks;
	
	public Analyst(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		perks = Calculation(30);
		
		netSalary = (perks + basicSalary) * 12;
	}

	@Override
	public String getSalaryDetails() {
		return "perks : "+perks;
	}
}
