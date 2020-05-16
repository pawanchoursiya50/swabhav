package com.techlab.model.test;

import java.util.Map;

import com.techlab.model.Employee;
import com.techlab.model.EmployeeDataAnalyzer;
import com.techlab.model.TxtFileLoader;
import com.techlab.model.URLLoader;

public class test {

	public static void main(String[] args) {

//		String URLlink = "https://swabhav-tech.firebaseapp.com/emp.txt";
//		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new URLLoader(URLlink));

		String fileLink = "G:\\swabhav\\OOP Assignments\\OOP Assignment 12\\dataFile_emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new TxtFileLoader(fileLink));
		
		Map<String, Integer> designation = analyzer.getDesignationWiseEmployees();
		System.out.println(designation);
		
		Map<Integer, Integer> department = analyzer.getDepartmentWiseEmployees();
		System.out.println(department);
		
		printInfo(analyzer.getMaxSalariedEmployee());
		

	}

	private static void printInfo(Employee emp) {
			System.out.println("\nMax salaried employee is ");
			System.out.println("name is: " + emp.getEname() + " salary is :" + emp.getSalary());
	}

}
