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
	
	@Override
	public int hashCode() {
		System.out.println("Inside hashCode");
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");

		if(obj == null && !(obj instanceof ListItem))
			return false;
		
		ListItem item = (ListItem) obj;
		if( id != item.id )
			return false;
		if(!name.equals(item.name))
			return false;
		if(price != item.price)
			return false;
		if(quantity != item.quantity)
			return false;
		
		return true;
		
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
