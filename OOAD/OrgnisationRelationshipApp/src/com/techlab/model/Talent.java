package com.techlab.model;

public class Talent {

	private int id;
	private String name;
	private double cgpa;
	private String techStack;
	private String partner;
	
	public Talent(int id, String name, double cgpa, String techStack, String partner) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.techStack = techStack;
		this.partner = partner;
	}

	@Override
	public String toString() {
		return "Talent [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", techStack=" + techStack + ", partner="
				+ partner + "]";
	}
	
}
