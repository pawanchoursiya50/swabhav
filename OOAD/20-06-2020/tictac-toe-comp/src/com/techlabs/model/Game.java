package com.techlabs.model;

import java.util.List;

public class Game {

	private Player currentPlayer, nextPlayer;
	List<Player> player;
	Board board;
	ResultAnalyzer analyzer;

	public Game(List<Player> player, Board board, ResultAnalyzer analyzer) {
		this.board = board;
		this.currentPlayer = player.get(0);
		this.nextPlayer = player.get(1);
		this.player = player;
		this.analyzer = analyzer;
	}

	public Status play(int possition) {
		if (board.mark(possition, getCurrentPlayer().getMarkofPlayer())) {
			changePlayer();
		}
		Status status = analyzer.analyzeResult();

		return status;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getNextPlayer() {
		if (getCurrentPlayer() == player.get(0)) {
			nextPlayer = player.get(1);
		} else {
			nextPlayer = player.get(0);
		}

		return nextPlayer;
	}

	private void changePlayer() {
		if(currentPlayer == player.get(0)) {
			currentPlayer = player.get(1);
			nextPlayer = player.get(0);
		}
		else {
			currentPlayer = player.get(0);
			nextPlayer = player.get(1);
		}
	}

}
