package com.techlab.model;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeDataAnalyzer {
	TreeSet<Employee> employees;
	public EmployeeDataAnalyzer(Loader loader) {
		employees = loader.load();
	}

	public Map<String, Integer> getDesignationWiseEmployees() {
		Map<String, Integer> designation = new TreeMap<String, Integer>();
		designation.put("Manager", 0);
		designation.put("Clerk", 0);
		designation.put("Analyst", 0);
		designation.put("Salesman", 0);
		designation.put("President", 0);

		for (Employee emp : employees) {
			if (emp.getDesignation().equalsIgnoreCase("manager")) {
				designation.replace("Manager", designation.get("Manager") + 1);
			} else if (emp.getDesignation().equalsIgnoreCase("clerk")) {
				designation.replace("Clerk", designation.get("Clerk") + 1);
			} else if (emp.getDesignation().equalsIgnoreCase("ANALYST")) {
				designation.replace("Analyst", designation.get("Analyst") + 1);
			} else if (emp.getDesignation().equalsIgnoreCase("SALESMAN")) {
				designation.replace("Salesman", designation.get("Salesman") + 1);
			} else {
				designation.replace("President", designation.get("President") + 1);
			}
		}
		return designation;
	}

	public Map<Integer, Integer> getDepartmentWiseEmployees() {
		Map<Integer, Integer> department = new TreeMap<Integer, Integer>();
		department.put(10, 0);
		department.put(20, 0);
		department.put(30, 0);

		for (Employee emp : employees) {
			if (emp.getDeptNo() == 10) {
				department.replace(10, department.get(10) + 1);
			} else if (emp.getDeptNo() == 20) {
				department.replace(20, department.get(20) + 1);
			} else {
				department.replace(30, department.get(30) + 1);
			}
		}
		return department;
	}

	public Employee getMaxSalariedEmployee() {
		return (employees.last());
	}
}
