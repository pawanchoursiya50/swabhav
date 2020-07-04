package com.techlab.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BoardTest {

	static Board board;
	
	@BeforeAll
	static void initializeBoardClass() {
		board = new Board();
	}
	
	@Test
	void test_mark_willMarkCell_andIsEmpty_WillReturnFalse() {
		board.mark(3, Mark.O);
		assertEquals(false, board.cells.get(3).isEmpty());
	}

}
