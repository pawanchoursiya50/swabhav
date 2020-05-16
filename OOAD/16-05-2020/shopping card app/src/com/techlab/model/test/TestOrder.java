package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Order;

class TestOrder {

	static Order order;
	static SimpleDateFormat formatter;
	
	@BeforeAll
	static void Instantiat_object_of_Order() throws ParseException {
		formatter = new SimpleDateFormat("dd-mm-yyyy");
		order = new Order(10, formatter.parse("15-02-2020"));
	}
	
	@Test
	void test_Id_return_10() {
		assertEquals(10, order.getId());
	}
	
	@Test
	void test_price_return_50() {
		assertEquals("15-02-2020", formatter.format( order.getDate() ));
	}

}
