package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

class TestLineItem {

	static LineItem item;
	
	@BeforeAll
	static void Instantiat_object_of_LineItem(){
		item = new LineItem(10, 5, new Product(101, "book", 50, 2));
	}
	
	@Test
	void test_Id_return_10() {
		assertEquals(10, item.getId());
	}
	
	@Test
	void test_Quantity_return_5() {
		assertEquals(5, item.getQuantity());
	}

	@Test
	void test_ProductID_return_101() {
		assertEquals(101, item.getProduct().getId());
	}
	
	@Test
	void test_ProductName_return_book() {
		assertEquals("book", item.getProduct().getName());
	}
	
	@Test
	void test_ProductPrice_return_50() {
		assertEquals(50, item.getProduct().getPrice());
	}
}
