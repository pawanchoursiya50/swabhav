package com.techlabs.model;

import java.util.List;

public class GameFactory {

	private static GameFactory bucket;
	private GameFactory() {}
	
	public static GameFactory getInstance() {
		if(bucket == null) {
			bucket = new GameFactory();
		}
		return bucket;
	}
	
	public Game makeGame(List<Player> player, Board board, ResultAnalyzer analyzer) {
		return new Game(player, board, analyzer);
	}
	
	
}
