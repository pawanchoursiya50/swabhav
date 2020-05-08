package com.techlab.model.test;

import java.util.TreeMap;

public class SortTreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(5, "pawan");
		students.put(2, "snady");
		students.put(11, "vinit");
		students.put(6, "pranay");
		students.put(1, "murtuza");
		students.put(9, "mokal");
		students.put(7, "amey");
		students.put(8, "jay");
		students.put(10, "prasad");
		
		
		System.out.println(students);
		
		//Collections.sort(rollNo);
		
		System.out.println(students);
	}

}
