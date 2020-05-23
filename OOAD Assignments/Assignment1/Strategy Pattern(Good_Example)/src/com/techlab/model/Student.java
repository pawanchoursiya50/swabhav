package com.techlab.model;

public class Student {

	Subject subject;
	
	public Student(Subject subject) {
		this.subject = subject;
	}
	
	public void StartLearning() {
		
		subject.learn();
	}
}
