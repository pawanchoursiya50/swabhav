package com.tachlabs.model;

import java.io.IOException;

public class Organisation {

	String[][] employees;

	public void PrintInfo(String link) throws IOException {

		ReadFile reader = new ReadFile();
		employees = reader.read("G:\\swabhav\\OOAD\\04-07-2020\\Employees.csv");

		for (int i = 0; i < employees.length; i++) {
			if (employees[i][3].toString().equalsIgnoreCase("NULL")) {
				display(0, i);
			}
		}
	}

	public void display(int level, int row) {
		String empNo = employees[row][0];

		printSpace(level);
		System.out.print(employees[row][1] + "(" + employees[row][2] + ")");
		System.out.println();

		for (int i = 1; i < employees.length; i++) {
			if (employees[i][3].toString().equalsIgnoreCase(empNo)) {
				display(level + 1, i);
			}
		}
	}

	public void printSpace(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
	}

}
