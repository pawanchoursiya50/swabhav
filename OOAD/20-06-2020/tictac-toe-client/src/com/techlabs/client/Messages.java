package com.techlabs.client;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;

public class Messages {

	public static void printBoard(Board board) {

		for (int i = 0; i < 9; i += 3) {
			for (int j = i; j < i + 3; j++) {
				if (board.cells.get(j).getMark() == Mark.Empty) {
					System.out.print("_  ");
				} else {
					System.out.print(board.cells.get(j).getMark() + "  ");
				}
			}
			System.out.println();
		}
	}

	public static void win(Mark mark) {
		System.out.println("'" + mark + "' win this match");
	}

	public static void draw() {
		System.out.println("Match draw");
	}

}
