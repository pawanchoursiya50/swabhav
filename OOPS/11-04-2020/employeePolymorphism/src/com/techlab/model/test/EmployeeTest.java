package com.techlab.model.test;


import com.techlab.model.*;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager mng = new Manager(101, "jay", 150000, "male");
		mng.calculateNetSalay();
		printInfo(mng);
		
		Developer dev = new Developer(102, "pawan", 50000, "male");
		dev.calculateNetSalay();
		printInfo(dev);
		
		Analyst ana = new Analyst(103, "prasad", 100000, "male");
		ana.calculateNetSalay();
		printInfo(ana);
	}

	private static void printInfo(Employee emp) {
		System.out.println("Id = " + emp.getId());
		System.out.println("Name = " + emp.getName());
		System.out.println("Basic Salary = " + emp.getBasicSalary());
		System.out.println("Anual salary = " + emp.getNetSalary() +"\n");

	}

}
