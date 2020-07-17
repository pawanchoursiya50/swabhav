package com.techlabs.components;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DiskLoader implements DataLoader {

	@Override
	public List<Employee> loadData() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("G:\\swabhav\\OOAD\\11-07-2020\\Employees.csv"));
			
			CreateEmployee creater = new CreateEmployee();
			return creater.create(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
