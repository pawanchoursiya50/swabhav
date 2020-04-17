package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultTest {

	@Test
	void multTest() {
		DoCalculations cal = new DoCalculations();
		int result = cal.mult(5, 10);
		assertEquals(50, result);
	}

}
