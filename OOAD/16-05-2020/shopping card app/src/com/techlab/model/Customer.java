package com.techlab.model;

import java.util.ArrayList;

public class Customer {

	private int id;
	private String name;
	private String address;
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

	public Iterable<Order> getAllOrders() {
		return orders;
	} 
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
}
