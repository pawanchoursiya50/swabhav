package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Product;

class TestProduct {

	static Product product;
	
	@BeforeAll
	static void Instantiat_object_of_Product() {
		product = new Product(101, "book", 50, 2);
	}
	
	@Test
	void test_Id_return_101() {
		assertEquals(101, product.getId());
	}
	
	@Test
	void test_Name_return_book() {
		assertEquals("book", product.getName());
	}
	
	@Test
	void test_price_return_50() {
		assertEquals(50, product.getPrice());
	}

}
