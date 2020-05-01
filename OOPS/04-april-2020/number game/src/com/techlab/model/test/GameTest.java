package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Game;

class GameTest {
	
	static Game game;
	
	@BeforeAll
	public static void generate_instanceof_Game() {
		game = new Game();
	}

	@Test
	void test_generateRandomNumber_return_integer() {
		int result = game.generateRandomNumber();
		assertEquals(50,  result);
	}

	@Test
	void test_matchNumber_5with10_return_possitive_1() {
		int result = game.matchNumber(5,  10);
		assertEquals(1,  result);
	}
	
	@Test
	void test_matchNumber_50with10_return_negative_1() {
		int result = game.matchNumber(50,  10);
		assertEquals(-1,  result);
	}
	
	@Test
	void test_matchNumber_5with5_return_0() {
		int result = game.matchNumber(5,  5);
		assertEquals(0,  result);
	}
}
