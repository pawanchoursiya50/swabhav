package com.techlab.model;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backWood, Wood topWood) {
		
//		super(builder, model, type, backWood, topWood);
		spec = new GuitarSpec(builder, model, type, backWood, topWood);
		this.serialNumber = serialNumber;
		this.price = price;
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
