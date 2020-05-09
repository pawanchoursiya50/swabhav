package com.techlab.model.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortHashMapTest {
	public static void main(String args[]) {
		HashMap<Integer, String> students = new HashMap<Integer, String>();
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
		// remove
		System.out.println(students.remove(1, "Jay"));
													
		System.out.println(students.remove(1, "vinit"));
		
		students.put(1, "sandy");
		students.put(4, "amey");

		// update
		students.replace(2, "Jay");
	
		// Search
		for (Integer i : students.keySet()) {
			if (students.get(i) == "murtuza")
				System.out.println("Key is: " + i + " Value is : " + students.get(i));
		}


		Map<Integer, String> map = sortValues(students);
		System.out.println("\n");
		System.out.println("After Sorting:");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		
		System.out.println(students);
		while (iterator.hasNext()) {
			Map.Entry employee = (Map.Entry) iterator.next();
			System.out.println(employee.getKey() + " " + employee.getValue());

		}
	}

	private static HashMap<Integer, String> sortValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}

