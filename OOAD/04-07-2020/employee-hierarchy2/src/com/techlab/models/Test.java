package com.techlab.models;

import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		CreateEmployee creater = new CreateEmployee();
		List<Employee> employees = creater.create("G:\\swabhav\\OOAD\\04-07-2020\\Employees.csv");
		
		System.out.println(employees.get(6).show(0));
		
		/*
		 List employees contains 15 employees, we can pass any employee and hierarchy
		 will start from that employee
		 * */
	}

}
