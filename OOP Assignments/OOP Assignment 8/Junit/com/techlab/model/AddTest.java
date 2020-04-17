package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void addTest() {
		DoCalculations cal = new DoCalculations();
		int result = cal.add(20, 30);
		assertEquals(50, result);
	}

}
