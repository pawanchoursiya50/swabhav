package com.techlab.model.JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.CurrentAccount;

class CurrentAccTest {

	@Test
	void test_Current_Account() {
		CurrentAccount currentAcc = new CurrentAccount(102, "sandeep", 2000);
		

		assertEquals(102, currentAcc.getAccount());
		
		assertEquals("sandeep", currentAcc.getName());

		assertEquals(2000, currentAcc.getBalance());
	}

}
