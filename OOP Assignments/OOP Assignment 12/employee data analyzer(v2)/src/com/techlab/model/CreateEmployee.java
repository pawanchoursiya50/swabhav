package com.techlab.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.TreeSet;

public class CreateEmployee {
	TreeSet<Employee> employees = new TreeSet<Employee>(new DuplicateRemover());

	public TreeSet<Employee> create(BufferedReader reader) {
		String line;
		try {
			while((line = reader.readLine()) != null) {
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
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return employees;
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

}
