package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubTest {

	@Test
	void subTest() {
		DoCalculations cal = new DoCalculations();
		int result = cal.sub(50, 20);
		assertEquals(30, result);
	}

}
