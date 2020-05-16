package com.techlab.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.TreeSet;

public class URLLoader implements Loader{

	String link;
	TreeSet<Employee> employees;
	public URLLoader(String link) {
		this.link = link;
	}
	
	@Override
	public TreeSet<Employee> load() {
		try {
			URL url = new URL(link);
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
			CreateEmployee createEmp = new CreateEmployee();
			employees = createEmp.create(reader);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return employees;
	}

}
