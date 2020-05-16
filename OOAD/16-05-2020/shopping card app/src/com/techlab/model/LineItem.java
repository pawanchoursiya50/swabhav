package com.techlab.model;

public class LineItem implements Comparable<LineItem> {
	private int id;
	private int quantity;
	private Product product;

	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public double calculateItemCost() {
		return quantity * product.getTotalPrice();
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", Product=" + product + "]";
	}

	@Override
	public int compareTo(LineItem o) {

		if (this.product.getId() == o.product.getId() 
				&& this.product.getName().equalsIgnoreCase(o.product.getName())
				&& this.product.getPrice() == o.product.getPrice() && this.getId() != o.getId()) {
		
			o.setQuantity(this.getQuantity() + o.getQuantity());
			return 0;
		}
		return 1;
	}

	public int getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
}
