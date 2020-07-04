package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	 Game game;
	 List<Player> players = new ArrayList<Player>();
	
	@BeforeEach
	 void initialize_Game() {
		Board board = new Board();
		players.add(new Player(Mark.O, board, "pawan"));
		players.add(new Player(Mark.X, board, "prasad"));
		
		game = new Game(players, board, new ResultAnalyzer(board));
	}
	
	@Test
	void test_getCurrentPlayer_return_PLayer1() {
		assertEquals(players.get(0), game.getCurrentPlayer());
	}
	
	@Test
	void test_getNextPlayer_return_PLayer2() {
		assertEquals(players.get(1), game.getNextPlayer());
	}
	
	@Test
	void test_play_return_Progress() {
		assertEquals(Status.Progress, game.play(8));
	}
	
	@Test
	void test_play_return_Win() {
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(2);
		assertEquals(Status.Win, game.play(5));
	}

	@Test
	void test_play_return_Draw() {
		game.play(0);
		game.play(1);
		game.play(2);
		game.play(3);
		game.play(4);
		game.play(5);
		game.play(6);
		game.play(7);
		assertEquals(Status.Win, game.play(8));
	}
	
	
	
	
	
	
}
