package com.techlab.model;

public class ItemList {

	private int productId;
	private double price;
	private String name;
	private int quntity;
	
	
	public ItemList(int productId, double price, String name, int quntity) {
		this.productId = productId;
		this.price = price;
		this.name = name;
		this.quntity = quntity;
	}

	public int getProductId() {
		return productId;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuntity() {
		return quntity;
	}
	
}
