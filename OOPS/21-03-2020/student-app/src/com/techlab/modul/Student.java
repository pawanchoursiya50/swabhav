package com.techlab.modul;

public class Student {
	private int id;
	private String name;
	private double cgpa;
	private static int count;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.cgpa = cgpa;
		this.name = name;
		
		count++;
	}

	public Student(int id, String name) {
		this(id, name, 7.0);
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

	public double getCgpa() {
		return cgpa;
	}
}
