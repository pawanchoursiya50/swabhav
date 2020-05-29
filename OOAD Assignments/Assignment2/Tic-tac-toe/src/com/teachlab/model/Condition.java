package com.teachlab.model;

public class Condition implements ICondition {

	@Override
	public boolean isCellEmpty(char[][] board, int x, int y) {
		if (board[x][y] == '_')
			return true;
		return false;
	}
	
	@Override
	public boolean isCordinatesCorrect(char[][] board, int x, int y) {
		if (x >= 0 && y >= 0 && x <= board.length - 1 && y <= board.length - 1)
			return true;
		return false;
	}

	@Override
	public boolean isMarkCorrect(char mark, String player) {
		if(player == "player1" && mark == 'O')
			return true;
		if(player == "player2" && mark == 'X')
			return true;
		return false;
	}

	@Override
	public boolean isWin(char[][] board, int x, int y, char mark) {
		// Checking row and column
		// In 1st round it checks for row and in 2nd round it checks for column
		for (int round = 0; round < 2; round++) {
			int a, b;
			boolean flage = true;
			for (int i = 0; i < board.length; i++) {

				if (round == 0) {
					a = i;
					b = y;
				} else {
					a = x;
					b = i;
				}

				if (board[a][b] != mark) {
					flage = false;
					break;
				}
			}
			if(flage == true) {
				return true;
			}
		}
		
		// checking diagonal1
		if (x == y) {
			boolean flage = true;
			for (int i = 0; i < board.length; i++) {
				if (board[i][i] != mark)
					flage = false;
			}
			if(flage == true) {
				return true;
			}
		}

		// checking diagonal2
		int size = board.length;
		if (x + y == size - 1) {
			boolean flage = true;
			for (int i = 0, j = size - 1; i < size && j >= 0; i++, j--) {
				if (board[i][j] != mark)
					flage = false;
			}
			if(flage == true) {
				return true;
			}
		}

		return false;
	}

	
}



