package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientFundException;

class InsufficientFundExceptionTest {

	static InsufficientFundException obj;
	
	@BeforeAll
	static void test() {
		Account acc = new Account(100, "pawan", 50000);
		obj = new InsufficientFundException(acc, 500);
	}

	@Test
	void test_getAcc_return_ObjectOfAccountClass() {
		assertEquals(true, obj.getAcc() instanceof Account);
	}
	
	@Test
	void test_getWithdrowAmt_return_500() {
		assertEquals(500, obj.getWithdrowAmt());
	}
	
}
