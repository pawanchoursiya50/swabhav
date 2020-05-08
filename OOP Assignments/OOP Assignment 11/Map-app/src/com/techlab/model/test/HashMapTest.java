package com.techlab.model.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		case1();
	}

	private static void case1() {
		HashMap<Integer, String> names = new HashMap<>();
		
		names.put(1, "pawan");
		names.put(1, "pawan");
		names.put(2, "pawan");
		names.put(5, "vinit");
		names.put(3, "prasad");
		names.put(4, "jay");
		names.put(null, "sonu");//accept null key
		names.put(6, null);//accept null value


		
		//getting all keys
		System.out.println(names.keySet());
		
		//getting all values
		System.out.println(names.values());
		
		//getting keys+values
		System.out.println(names);
		
		// change/update name with the help of key or key+value
		names.replace(1, "vinit");
		names.replace(4, "prasad", "murtuza");
		System.out.println(names);
		
		//Do searching ie check if particular key and value is present or not
		System.out.println(names.containsKey(5) +", "+ names.containsValue("jay"));
		
		//Remove the values for any particular key
		if(names.containsKey(5))
			names.remove(5);
		names.remove(10); //if key not present then also don't give any error
		System.out.println(names);

		//find out size of map
		System.out.println("Size "+ names.size());
		
		//remove all values from map
		names.clear();
		System.out.println(names);
	}

}
