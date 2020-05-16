package com.techlab.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class FileHandler {
	TreeSet<Employee> employees = new TreeSet<Employee>(new DuplicateRemover());
	private String file;

	public FileHandler(String file) {
		this.file = file;
	}

	public void createEmployees() throws ParseException {
		Reader reader = new Reader(file);
		ArrayList<String> data = reader.read();
		for (String line : data) {
			String[] values = line.split(",");
			int empId = Integer.parseInt(values[0]);
			String eName = values[1].replaceAll("'", "");
			String designation = values[2].replaceAll("'", "");
			int managerId = validateInteger(values[3]);
			String dob = values[4].replaceAll("'", "");
			double salary = Double.parseDouble(values[5]);
			double commission = validateDouble(values[6]);
			int deptId = Integer.parseInt(values[7]);
			employees.add(new Employee(empId, eName, designation, managerId, dob, salary, commission, deptId));
		}
	}

	private int validateInteger(String parameter) {
		if (parameter.equals("NULL"))
			return 0;
		return Integer.parseInt(parameter);
	}

	private double validateDouble(String paramter) {
		if (paramter.equals("NULL"))
			return 0;
		return Double.parseDouble(paramter);
	}

	public Employee getMaxSalariedEmployee() {
		
		return (employees.last());

	}

	public Iterator<Employee> getEmployees() {
		return employees.iterator();
	}
}