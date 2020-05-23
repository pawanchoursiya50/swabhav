package com.techlab.model.test;

import com.techlab.model.Java;
import com.techlab.model.Python;
import com.techlab.model.Student;

public class StudentTesst {

	public static void main(String[] args) {

		Student student = new Student(new Java());
		student.StartLearning();
		
		Student student2 = new Student(new Python());
		student2.StartLearning();

	}

}
