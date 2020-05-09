package com.techlab.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashSetTest {

	public static void main(String[] args) {

//		HashSet<String> students = new HashSet<String>();
//		students.add("pawan");
//		students.add("jay");
//		students.add("vinay");
//		students.add("pranay");
//		students.add("sandeep");
//		students.add("prasad");
//		students.add("murtuza");
//		students.add("pratik");
//		students.add("amaey");
//		
//		
//		System.out.println(students);
//		
//		List<String> names = new ArrayList<String>(students);
//		
//		Collections.sort(names);
//		System.out.println(names);
		
		ArrayList<String> boys = new ArrayList<String>();
		boys.add("pawan");
		boys.add("jay");
		boys.add("vinay");
		boys.add("pranay");
		boys.add("sandeep");
		boys.add("pranay");
		boys.add("pawan");
		
		System.out.println(boys);
		
		
		Collections.sort(boys);
		System.out.println(boys);
	}
	
	

}
