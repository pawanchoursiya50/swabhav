package com.techlab.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateEmployee {	
	SimpleDateFormat formatter = new SimpleDateFormat("dd,mm,yyy");
	
	public List<Employee> create(String link) throws Exception {
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(link));
		List<Employee> employees = new ArrayList<Employee>();
		
		while ((line = reader.readLine()) != null) {
			String[] details = line.split(",");
			if(details[0].equalsIgnoreCase("EMPNO"))
				continue;
				int empid = convertToInt(details[0]);
				int mg_id = convertToInt(details[3]);
//				Date doj = formatter.parse(details[4]) ;
				int salary = convertToInt(details[5]);
				int commision = convertToInt(details[6]);
				int deptno = convertToInt(details[7]);
				
//				employees.add(new Employee(empid, details[1], details[2], mg_id, doj, salary, commision, deptno));
				employees.add(new Employee(empid, details[1], details[2], mg_id, salary, commision, deptno));

		}
		reader.close();
		createHierarchy(employees);
		
		return employees;
	}
	
	private void createHierarchy(List<Employee> employees) {
		for(Employee emp : employees) {
			for(Employee anotherEmp : employees) {
				if(emp.getEmpid() == anotherEmp.getMg_id()) {
					emp.addReporttee(anotherEmp);
				}
			}
		}
	}
	
	public int convertToInt(String str) {
		if(str.equalsIgnoreCase("NULL")) {
			return 0;
		}
		return Integer.parseInt(str);
	}
}
