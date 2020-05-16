package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Customer;

class TestCustomer {

	static Customer cust;
	
	@BeforeAll
	static void Instantiat_object_of_Order() {
		cust = new Customer(101, "kishore", "mumbai");
	}
	
	@Test
	void test_Id_return_101() {
		assertEquals(101, cust.getId());
	}
	
	@Test
	void test_Name_return_kishore() {
		assertEquals("kishore", cust.getName());
	}
	
	@Test
	void test_Address_return_mumbai() {
		assertEquals("mumbai", cust.getAddress());
	}

}
