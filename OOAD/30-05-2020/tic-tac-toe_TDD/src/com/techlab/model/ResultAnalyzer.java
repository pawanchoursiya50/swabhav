package com.techlab.model;

import java.util.ArrayList;

public class ResultAnalyzer {

	Board board;
	ArrayList<Cell> cells;

	public ResultAnalyzer(Board board) {
		this.board = board;
		cells = board.cells;
	}

	public Result analyzeResult() {

		// Checking for rows
		for (int row = 0; row < 9; row = row + 3) {
			int count = 0;
			for (int i = row; i < row + 2; i++) {
				if (cells.get(i).getMark() == cells.get(i + 1).getMark() && cells.get(i).getMark()!=Mark.Empty) {
					count++;
				}
			}
			if (count == 2) {
				return Result.Win;
			}
		}

		// checking for column
		for (int col = 0; col < 3; col++) {
			int count = 0;
			for (int i = col; i < col + 6; i = i + 3) {
				if (cells.get(i).getMark() == cells.get(i + 3).getMark() && cells.get(i).getMark()!=Mark.Empty) {
					count++;
				}
				if (count == 2) {
					return Result.Win;
				}
			}
		}
		
		//Checking for Diagonal
		int count1=0, count2 = 0;
		for(int diag1=0, diag2=2; diag1<9 && diag2<6;  diag1+=4, diag2+=2) {
			if(cells.get(diag1).getMark() == cells.get(diag1+4).getMark() && cells.get(diag1).getMark()!=Mark.Empty) {
				count1++;
			}
			if(cells.get(diag2).getMark() == cells.get(diag2+2).getMark() && cells.get(diag2).getMark()!=Mark.Empty) {
				count2++;
			}
			if (count1 == 2 || count2 == 2) {
				return Result.Win;
			}
		}
		
		//Checking for Draw or Progress
		for(int i=0; i<9; i++) {
			if(cells.get(i).getMark() == Mark.Empty) {
				return Result.Progress;
			}
		}
		
		return Result.Draw;

	}
}
