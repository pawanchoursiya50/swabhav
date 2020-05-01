package com.techlab.model.test;

import java.util.HashSet;
import java.util.Iterator;

public class Countries {

	public static void main(String[] args) {

		HashSet<String> countries = new HashSet<String>();
		
		countries.add("india");
		countries.add("china");
		countries.add("US");
		countries.add("japan");
		countries.add("brazil");
		printInfo(countries);
		
		System.out.println("Total countries in hashset is : "+ countries.size());
		
		if(countries.contains("italy"))
			System.out.println("Italy is present in our hashset");
		else
			System.out.println("Italy not present in our hashset");

		//Iterate through iterator()
		if(!countries.isEmpty()) {
			Iterator<String> list = countries.iterator();
			while(list.hasNext()) {
				System.out.println(list.next());
			}
		}
		
		countries.remove("brazil");
		printInfo(countries);
		
		countries.clear();
		
		
		
	}

	private static void printInfo(HashSet<String> countries) {
		System.out.println(countries);
	}

}
