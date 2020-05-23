package com.techlab.model;

public class Student {

	String subject;
	
	public Student(String subject) {
		this.subject = subject;
	}
	
	public void learn() {
		if(subject.equals("java")) {
			System.out.println("Learing java");
		}
		else if(subject.equals("python")) {
			System.out.println("Learing python");
		}
		else if(subject.equals("php")) {
			System.out.println("Learing php");
		}
	}
}
