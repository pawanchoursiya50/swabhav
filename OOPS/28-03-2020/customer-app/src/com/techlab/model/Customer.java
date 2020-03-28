package com.techlab.model;

public class Customer {
	private int id;
	private String name;
	private int order;
	private static int count;
	
	static{
		count = 1000;
	}
	
	public Customer(String name, int order) {
		this.name = name;
		this.order = order;
		
		count++;
		this.id = count;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
