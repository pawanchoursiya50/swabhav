package com.techlab.model.test;

import java.text.ParseException;
import java.util.Iterator;
import java.util.TreeSet;

import com.techlab.model.FileHandler;
import com.techlab.model.Employee;

public class Test {
	public static void main(String[] args) throws ParseException {
		FileHandler handler = new FileHandler("G:\\swabhav\\OOP Assignments\\OOP Assignment 12\\dataFile_emp.txt");
		handler.createEmployees();
		printInfo(handler);
		printInfo(handler.getMaxSalariedEmployee());

	}

	public static void printInfo(FileHandler handler) {
		
		int count = 0;
		System.out.println("Total count of Employees based on Designation as follows: ");
		int totalColumns = 1;
		String employeebyDesignation[][] = new String[2][totalColumns];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < totalColumns; j++) {
				employeebyDesignation[i][j] = "0";
			}
		}

		for (Iterator<Employee> emp = handler.getEmployees(); emp.hasNext();) {
			boolean result = false;
			Employee e = emp.next();
			for (int i = 0; i < totalColumns; i++) {
				String Str = e.getDesignation();
				if (employeebyDesignation[0][i].contentEquals(Str)) {
					count = Integer.parseInt(employeebyDesignation[1][i]);
					count++;
					employeebyDesignation[1][i] = String.valueOf(count);
					result = true;
				}
			}

			if (result == false) {
				totalColumns++;
				String temp[][] = new String[2][totalColumns];
				totalColumns--;
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < totalColumns; j++) {
						temp[i][j] = employeebyDesignation[i][j];
					}
				}
				totalColumns++;
				employeebyDesignation = temp;
				employeebyDesignation[0][--totalColumns] = e.getDesignation();
				count = 1;
				employeebyDesignation[1][totalColumns] = String.valueOf(count);
				totalColumns++;

			}

		}
		for (int i = 0; i < totalColumns; i++) {
			if (employeebyDesignation[0][i] != "0")
				System.out.println("Designation is : " + employeebyDesignation[0][i] + " Count is : "
						+ employeebyDesignation[1][i]);
		}

		count = 0;
		System.out.println("\nTotal count of Employees based on Deptno as follows: ");
		totalColumns = 1;
		String employeebyDeptNo[][] = new String[2][totalColumns];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < totalColumns; j++) {
				employeebyDeptNo[i][j] = "0";
			}
		}

		for (Iterator<Employee> emp = handler.getEmployees(); emp.hasNext();) {
			boolean result = false;
			Employee e = emp.next();
			for (int i = 0; i < totalColumns; i++) {
				String deptNo = String.valueOf(e.getDeptNo());
				if (employeebyDeptNo[0][i].contentEquals(deptNo)) {
					count = Integer.parseInt(employeebyDeptNo[1][i]);
					count++;
					employeebyDeptNo[1][i] = String.valueOf(count);
					result = true;
				}
			}

			if (result == false) {
				totalColumns++;
				String temp[][] = new String[2][totalColumns];
				totalColumns--;
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < totalColumns; j++) {
						temp[i][j] = employeebyDeptNo[i][j];
					}
				}
				totalColumns++;
				employeebyDeptNo = temp;
				employeebyDeptNo[0][--totalColumns] = String.valueOf(e.getDeptNo());
				count = 1;
				employeebyDeptNo[1][totalColumns] = String.valueOf(count);
				totalColumns++;

			}

		}
		for (int i = 0; i < totalColumns; i++) {
			if (employeebyDeptNo[0][i] != "0")
				System.out.println("Deptno is : " + employeebyDeptNo[0][i] + " Count is : "
						+ employeebyDeptNo[1][i]);
		}
	}

	public static void printInfo(Employee e) {
		System.out.println("\nMax salaried employee is ");
		System.out.println("name is: " + e.getEname() + " salary is :" + e.getSalary());
	}
	

}