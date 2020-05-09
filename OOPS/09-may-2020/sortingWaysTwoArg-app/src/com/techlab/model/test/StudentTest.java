package com.techlab.model.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(1, 10, "ABC", 8.0);
		Student s2 = new Student(1, 10, "ABC", 8.0);
		
		Student s3 = new Student(2, 10, "ABC", 8.0);
		Student s4 = new Student(1, 12, "ABC", 8.0);

		Map<Student,Student> map = new TreeMap<Student,Student>();
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		map.put(s4, s4);
		
		System.out.println(map.size());
		
	
		
		Set set = map.entrySet();
		Iterator stud =  set.iterator();
		while(stud.hasNext()) {
			System.out.println(stud.next());
		}
	}

}
