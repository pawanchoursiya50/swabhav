package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CellTest {

	static Cell cell;
	
	@BeforeAll
	void initializeCellClass() throws NotEmptyException {
		cell = new Cell();
		cell.markCell(Mark.O);
	}
	
	@Test
	void test_isEmpty_return_False_weHaveMarkItThrough_markCell_method() {
		assertEquals(false, cell.isEmpty());
	}
	
	@Test
	void test_getMark_return_currentValueOf_mark() {
		assertEquals(Mark.O, cell.getMark());
	}
	
}
