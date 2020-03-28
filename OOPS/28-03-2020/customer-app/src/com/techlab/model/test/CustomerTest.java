package com.techlab.model.test;

import com.techlab.model.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("pawan", 100);
		Customer c2 = new Customer("panjak", 150);
		Customer c3 = new Customer("mutuz", 150);
		Customer c4 = new Customer("jay", 150);
		
		getId(c1);
		getId(c2);
		getId(c3);
		getId(c4);
		
		getId(c1);
		getId(c2);
	}
	
	private static void getId(Customer c) {
		
		System.out.println("Id of " +c.getName()+ " is "+c.getId());
	}

}
