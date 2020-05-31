package com.techlab.model;

public class Game {

	Player player1, player2;
	Board board;
	ResultAnalyzer analyzer;
	Result result;

	public Game() {
		// Game will create 2 player, 1 board and 1 analyzer to analyze the match
		board = new Board();
		player1 = new Player(Mark.O, board);
		player2 = new Player(Mark.X, board);
		analyzer = new ResultAnalyzer(board);
	}

	public void start() {
		player1();
	}

	public void player1() {
		message.printBoard(board);
		if (player1.play()) {
			result = analyzer.analyzeResult();
			if (result == Result.Progress) {
				player2();
			} 
			else if (result == Result.Draw) {
				message.draw();
				message.printBoard(board);
			} 
			else if (result == Result.Win) {
				message.win(player1.getMarkofPlayer());
				message.printBoard(board);
			}

		} else {
			player1();
		}
	}

	public void player2() {
		message.printBoard(board);
		if (player2.play()) {
			result = analyzer.analyzeResult();
			if (result == Result.Progress) {
				player1();
			} 
			else if (result == Result.Draw) {
				message.draw();
				message.printBoard(board);
			}
			else if (result == Result.Win) {
				message.win(player1.getMarkofPlayer());
				message.printBoard(board);
			}
		} else {
			player2();
		}
	}
}
