package com.techlab.model;

public class ListItem {

	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public ListItem(int id, String name, double price, int quntity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quntity;
	}

	public double calculateTotal() {
		return price * quantity;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuntity() {
		return quantity;
	}
	
	
}
