package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {
	
	@BeforeClass
	void initialization_Of_ResultAnalyzer() {
		ResultAnalyzer analyzer = new ResultAnalyzer(new Board());
	}
	
	@Test
	void test_analyzeResult_return_matchProgress() {
		ResultAnalyzer analyzer = new ResultAnalyzer(new Board());
		assertEquals(Status.Progress, analyzer.analyzeResult());
	}
	
	@Test
	void test_analyzeResult_return_matchWin() {
		Board board = new Board();
		board.mark(0, Mark.O);
		board.mark(4, Mark.O);
		board.mark(8, Mark.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		
		assertEquals(Status.Win, analyzer.analyzeResult());

	}
	
	@Test
	void test_analyzeResult_return_matchDraw() {
		Board board = new Board();
		board.mark(0, Mark.O);
		board.mark(1, Mark.O);
		board.mark(2, Mark.X);
		board.mark(3, Mark.X);
		board.mark(4, Mark.X);
		board.mark(5, Mark.O);
		board.mark(6, Mark.O);
		board.mark(7, Mark.O);
		board.mark(8, Mark.X);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		assertEquals(Status.Draw, analyzer.analyzeResult());
	}

}
