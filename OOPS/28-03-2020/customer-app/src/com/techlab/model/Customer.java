package com.techlab.model;

public class Customer {
	private String id;
	private String name;
	private int order;
	
	private static int nextId;
	
	static{
		nextId = 1000;
	}
	
	public Customer(String name, int order) {
		this.name = name;
		this.order = order;
		
		nextId++;
		this.id = "C"+nextId;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
