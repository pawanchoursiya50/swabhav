package com.test.model.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Counting {

	public static void main(String[] args) {

		LinkedHashSet<String> count = new LinkedHashSet<String>();
		count.add("One");
		count.add("Two");
		count.add("Three");
		count.add("Four");
		printInfo(count);
		
		count.add("Six");
		if(count.contains("Two")) {
			count.remove("Two");
			System.out.println("Two has removed");
		}
		
		System.out.println("Length of count is ::- "+ count.size());
		
		Iterator list = count.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}

	private static void printInfo(LinkedHashSet<String> count) {
		System.out.println(count);
	}

}
