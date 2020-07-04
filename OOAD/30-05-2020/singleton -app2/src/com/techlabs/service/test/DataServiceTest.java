package com.techlabs.service.test;

import com.techlabs.service.DataService;

public class DataServiceTest {

	public static void main(String[] args) {

				
		DataService service1 = DataService.Instance;
		System.out.println("Hashcode of service1 : "+ service1.hashCode());
		service1.doSomething();
		
		DataService service2 = DataService.Instance;
		System.out.println("Hashcode of service1 : "+ service2.hashCode());
		service2.doSomething();
	}

}
