package com.techlab.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeSet;

public class TxtFileLoader implements Loader{

	String link;
	TreeSet<Employee> employees;

	public TxtFileLoader(String link) {
		this.link = link;
	}

	public TreeSet<Employee> load() {

		try {
			BufferedReader reader = new BufferedReader( new FileReader(link) );
			CreateEmployee createEmp = new CreateEmployee();
			employees = createEmp.create(reader);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return employees;
	}


	
	
}
