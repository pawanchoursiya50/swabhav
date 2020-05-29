package com.techlab.model;

public class Prasad {

	private static Prasad p = new Prasad();
	
	private Prasad() {
	}

	public static Prasad getPrasad() {
		return p;
	}

}
