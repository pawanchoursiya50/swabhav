package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Account;

class AccountTest {

	static Account acc;
	
	@BeforeAll
	 static void test() {
		acc = new Account(101, "Pawan", 50000);
	}
	
	@Test
	void test_getAccNo_should_return_100() {
		assertEquals(101, acc.getAccNo());
	}
	
	@Test
	void test_getName_should_return_Pawan() {
		assertEquals("Pawan", acc.getName());
	}
	
	@Test
	void test_getBalance_should_return_100000() {
		acc.deposite(50000);
		assertEquals(100000, acc.getBalance());
	}
	
	@Test
	void test_getBalance_should_return_1000() {
		acc.withDraw(99000);
		assertEquals(1000, acc.getBalance());
	}
	
	@Test
	void test_getMINIMUM_BAL_should_return_500() {
		assertEquals(500, acc.getMINIMUM_BAL());
	}
	
	

}
