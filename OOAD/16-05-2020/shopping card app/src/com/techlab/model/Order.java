package com.techlab.model;

import java.util.Date;
import java.util.TreeSet;

public class Order {

	int id;
	private Date date;
	private TreeSet<LineItem> items = new TreeSet<LineItem>();
	
	public Order(int id, Date date) {
		this.id = id;
		this.date = date;
	}
	
	public void addItem(LineItem item) {
		items.add(item);
	}

	public double checkOutCost() {
		double totalCheckOutCost = 0;
		
		for(LineItem item : items) {
			totalCheckOutCost += item.calculateItemCost();
		}
		
		return totalCheckOutCost;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public Iterable<LineItem> getAllItems() {
		return items;
	}

	





}
