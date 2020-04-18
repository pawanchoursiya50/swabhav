package com.techlab.model.JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.SavingAccount;

class SavingAccTest {

	@Test
	void test_Saving_Account() {
		
		SavingAccount savingAcc = new SavingAccount(101, "pawan", 1000);

		assertEquals(101, savingAcc.getAccount());
		
		assertEquals("pawan", savingAcc.getName());

		assertEquals(1000, savingAcc.getBalance());

	}
	

}
