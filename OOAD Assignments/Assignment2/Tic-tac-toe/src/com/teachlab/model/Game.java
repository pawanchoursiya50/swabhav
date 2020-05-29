package com.teachlab.model;

import java.util.Scanner;

public class Game {

	char[][] board;
	Scanner scn;
	ICondition condition;
	String player;

	public Game(ICondition condition) {
		this.condition = condition;
		board = new char[][] { { '_', '_', '_' },
							   { '_', '_', '_' },
							   { '_', '_', '_' } };
							   
		scn = new Scanner(System.in);
	}

	public void play() {
		boolean flage = false;
		message.rules();

		for (int i = 0; i < Math.pow(board.length, 2); i++) {
			
			message.printBoard(board);
			decidePlayer(i);
			
			int x = Integer.parseInt(scn.next()) - 1;
			int y = Integer.parseInt(scn.next()) - 1;
			char mark = Character.toUpperCase(scn.next().charAt(0));

			if (condition.isCordinatesCorrect(board, x, y)) {
				if (condition.isMarkCorrect(mark, player)) {
					if (condition.isCellEmpty(board, x, y)) {
						board[x][y] = mark;
						if (condition.isWin(board, x, y, mark)) {
							System.out.println(player + " win this game");
							flage = true;
							break;
						}
					} else {
						message.notEmptyCell();
						i--;
					}
				} else {
					message.notCorrectMark();
					i--;
				}

			} else {
				message.notCorrectCordinate();
				i--;
			}
		}
		if(flage == false) {
			System.out.println("No one wins the match and match is draw");
		}
		message.printBoard(board);
	}

	private void decidePlayer(int i) {
		if (i % 2 == 0) {
			player = "player1";
			System.out.println(player + "'s move");
		} else {
			player = "player2";
			System.out.println(player + "'s move");
		}
	}
}
