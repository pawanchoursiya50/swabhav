package com.techlab.model;

import java.util.Scanner;

public class Player {

	private Mark markofPlayer;
	Board board;
	Scanner scn;
	
	public Player(Mark markofPlayer, Board board) {
		this.markofPlayer = markofPlayer;
		this.board = board;
		scn = new Scanner(System.in);
	}
	
	public boolean play() {
		System.out.print("'"+ markofPlayer +"' enter your possition : ");
		int possition = scn.nextInt();
		return board.mark(possition, markofPlayer);
	}

	public Mark getMarkofPlayer() {
		return markofPlayer;
	}	
	
}
