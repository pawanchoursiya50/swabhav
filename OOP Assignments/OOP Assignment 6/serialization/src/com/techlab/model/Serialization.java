package com.techlab.model;

import java.io.Serializable;

public class Serialization implements Serializable {
	
	private int id;
	private String name;
	
	public Serialization(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
