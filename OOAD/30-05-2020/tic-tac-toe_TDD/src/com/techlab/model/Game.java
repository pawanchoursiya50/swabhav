package com.techlab.model;

import java.util.List;

public class Game {

//	Player player1, player2;
	Player currentPlayer, nextPlayer;
	List<Player> player;
	Board board;
	ResultAnalyzer analyzer;
	Status resultType;


	public Game(List<Player> player, Board board, ResultAnalyzer analyzer) {
		this.board = board;
		this.currentPlayer = player.get(0);
		this.nextPlayer = player.get(1);
		this.player = player;
		this.analyzer = analyzer;
	}
	
	public Status play(int possition) {
		if(board.mark(possition, getCurrentPlayer().getMarkofPlayer())) {
			currentPlayer = getNextPlayer();
		}
		Status status = analyzer.analyzeResult();
		
		return status;
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getNextPlayer() {
		if(getCurrentPlayer() == player.get(0)) {
			nextPlayer = player.get(1);
		}
		else {
			nextPlayer = player.get(0);
		}
		
		return nextPlayer;
	}
	
//	
//	public void start() {
//		player1();
//	}
//
//	public void player1() {
//		message.printBoard(board);
//		if (player1.play()) {
//			resultType = analyzer.analyzeResult();
//			if (resultType == Status.Progress) {
//				player2();
//			} 
//			else if (resultType == Status.Draw) {
//				message.draw();
//				message.printBoard(board);
//			} 
//			else if (resultType == Status.Win) {
//				message.win(player1.getMarkofPlayer());
//				message.printBoard(board);
//			}
//
//		} else {
//			player1();
//		}
//	}
//
//	public void player2() {
//		message.printBoard(board);
//		if (player2.play()) {
//			resultType = analyzer.analyzeResult();
//			if (resultType == Status.Progress) {
//				player1();
//			} 
//			else if (resultType == Status.Draw) {
//				message.draw();
//				message.printBoard(board);
//			}
//			else if (resultType == Status.Win) {
//				message.win(player2.getMarkofPlayer());
//				message.printBoard(board);
//			}
//		} else {
//			player2();
//		}
//	}
//	
	
}
