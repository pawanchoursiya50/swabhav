package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	static ResultAnalyzer analyzer;
	
	@BeforeClass
	void initialization_Of_ResultAnalyzer() {
		analyzer = new ResultAnalyzer(new Board());
	}
	
	@Test
	void test_analyzeResult_return_matchProgress() {
		//Initially all cells are Empty
		assertEquals(Result.Progress, analyzer.analyzeResult());
	}

}
