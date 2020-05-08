package com.techlab.model.test;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		case1();
	}

	private static void case1() {

		TreeMap<Integer,String> students = new TreeMap<Integer, String>();
		students.put(1, "pawan");
		students.put(1, "jay");
		students.put(2, "murtuza");
		students.put(5, "vinay");
		students.put(4, "prasad");
		students.put(3, "pranay");
//		students.put(null, "sonu"); Do not accept null key
		students.put(6, null);//accept multiple null value
		students.put(7, null);
		
		System.out.println(students.get(3));
		System.out.println(students.keySet()); //all keys
		System.out.println(students.values()); //all values
		System.out.println(students); //key+vlues
		
		if(students.containsKey(5)) {
			students.remove(5); //remove element
		}

		System.out.println("Is map have null values : "+ students.containsValue(null));
		
		students.replace(2, "narayan");
		students.replace(4, "prasad", "pranay");
		
		System.out.println(students);
		
		students.clear(); //Remove all elements
		System.out.println(students);
	}

}
