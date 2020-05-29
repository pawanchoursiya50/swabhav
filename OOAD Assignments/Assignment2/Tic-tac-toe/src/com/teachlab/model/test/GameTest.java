package com.teachlab.model.test;

import com.teachlab.model.Condition;
import com.teachlab.model.Game;

public class GameTest {
	public static void main(String[] args) {
		
		Game game = new Game(new Condition());
		game.play();
	}

}
