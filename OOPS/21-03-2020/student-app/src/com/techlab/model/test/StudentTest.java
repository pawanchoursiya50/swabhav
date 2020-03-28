package com.techlab.model.test;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"abc");
		System.out.println(s1.getStudentCount());
		     
		Student s2 = new Student(102,"xyz");
		System.out.println(s2.getStudentCount());
		
		Student s3 = new Student(103,"lmno", (float)8.4);
		System.out.println(s3.getStudentCount());	}

}
