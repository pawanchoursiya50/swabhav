package com.techlabs.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateEmployee {

	public List<Employee> create(BufferedReader reader) throws IOException {
		String line;
		List<Employee> employees = new ArrayList<Employee>();

		while ((line = reader.readLine()) != null) {
			String[] details = line.split(",");
			if (details[0].equalsIgnoreCase("EMPNO"))
				continue;
			int empid = convertToInt(details[0]);
			int mg_id = convertToInt(details[3]);
			int salary = convertToInt(details[5]);
			int commision = convertToInt(details[6]);
			int deptno = convertToInt(details[7]);

			employees.add(new Employee(empid, details[1], details[2], mg_id, salary, commision, deptno));

		}
		return employees;
	}

	public int convertToInt(String str) {
		if (str.equalsIgnoreCase("NULL")) {
			return 0;
		}
		return Integer.parseInt(str);
	}
}
