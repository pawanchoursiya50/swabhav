package com.techlab.model;

public class Developer extends Employee {
	
	private double pa;
	private double bonus;


	public Developer(int id, String name, double basicSalary, String gender) {
		super(id, name, basicSalary, gender);
	}

	@Override
	public void calculateNetSalay() {
		pa = Calculation(40);
		bonus = Calculation(30);
		
		netSalary = (pa + bonus + basicSalary) * 12;
	}

	@Override
	public String getSalaryDetails() {
		return "pa : "+pa+ ", bonus : "+bonus;
	}
	
}
