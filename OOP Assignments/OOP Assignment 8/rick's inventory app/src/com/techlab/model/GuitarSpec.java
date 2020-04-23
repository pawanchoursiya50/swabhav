package com.techlab.model;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numString;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}
	
	public boolean match(GuitarSpec wantGuitar) {
		
		if (!this.model.equalsIgnoreCase(wantGuitar.getModel())) {
			return false;
		}
		if (builder != wantGuitar.getBuilder() ){
			return false;
		}
		if (type != wantGuitar.getType() ) {
			return false;
		}
		if (backWood !=wantGuitar.getBackWood() ) {
			return false;
		}
		if (topWood != wantGuitar.getTopWood() ) {
			return false;
		}
		if (numString != wantGuitar.getNumString() ) {
			return false;
		}
		return true;
	}
	

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	public int getNumString() {

		return numString;
	}
	
	
}
