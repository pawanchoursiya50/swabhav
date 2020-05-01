package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int count;

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.cgpa = cgpa;
		this.name = name;
		
		count++;
	}

	public Student(int id, String name) {
		this(id, name, (float) 7.0);
	}
	
	public int getStudentCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}
}
