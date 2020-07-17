package com.techlabs.components;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class UrlLoader implements DataLoader {

	@Override
	public List<Employee> loadData() {
		String line;
		URL url;
		try {
			url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			
			CreateEmployee creater = new CreateEmployee();
			return creater.create(reader);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
