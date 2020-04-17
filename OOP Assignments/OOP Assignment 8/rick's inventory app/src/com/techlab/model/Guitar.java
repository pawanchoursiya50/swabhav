package com.techlab.model;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = guitarSpec;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
}
