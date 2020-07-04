package com.techlabs.service;

public class DataService {

	static DataService bucket;
	private DataService() {
		System.out.println("service created");
	}
	
	public static DataService getInstance() {
		if(bucket == null) {
			bucket = new DataService();
		}
		return bucket;
	}
	
	public void doSomething() {
		System.out.println("work is done by : "+ this.hashCode());
	}

}
