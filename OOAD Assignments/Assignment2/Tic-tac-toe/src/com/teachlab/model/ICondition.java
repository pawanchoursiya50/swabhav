package com.teachlab.model;

public interface ICondition {

	boolean isCellEmpty(char[][] board, int x, int y);
	
	boolean isCordinatesCorrect(char[][] board, int x, int y);

	boolean isMarkCorrect(char mark, String player);

	boolean isWin(char[][] board, int x, int y, char mark);
}
