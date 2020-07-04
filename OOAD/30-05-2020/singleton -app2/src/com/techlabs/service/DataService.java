package com.techlabs.service;

public enum DataService {
	
	Instance;
	
	public void doSomething() {
		System.out.println("work is done by : "+ this.hashCode());
	}
}
