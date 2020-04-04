package com.techlab.model;

import java.io.Serializable;

public class ArraySerialization implements Serializable{
	
	private int id;
	private String name;
	
	public ArraySerialization(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
