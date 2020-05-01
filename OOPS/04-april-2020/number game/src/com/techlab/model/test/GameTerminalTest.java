package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.GameTerminal;

class GameTerminalTest {

	static GameTerminal gTerminal;
	
	@BeforeAll
	public static void initiate_GameTerminal() {
		gTerminal = new GameTerminal();
	}
	
	@Test
	void test_checkResult_take_possitive1_Return_false() {
		
		assertEquals(false, gTerminal.checkResult(1) );
	}
	
	@Test
	void test_checkResult_take_Negative1_Return_false() {
		
		assertEquals(false, gTerminal.checkResult(-1) );
	}

	@Test
	void test_checkResult_take0_Return_true() {
		
		assertEquals(true, gTerminal.checkResult(0) );
	}
}
