package com.techlabs.model;

import java.util.Scanner;

public class Player {

	private Mark markofPlayer;
	private String name;
	Board board;
	Scanner scn;
	
	public Player(Mark markofPlayer, Board board, String name) {
		this.markofPlayer = markofPlayer;
		this.board = board;
		this.name = name;
		scn = new Scanner(System.in);
	}
	
	public boolean play() {
//		System.out.print("'"+ markofPlayer +"' enter your possition : ");
		try {
			int possition = scn.nextInt()-1;
			return board.mark(possition, markofPlayer);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public Mark getMarkofPlayer() {
		return markofPlayer;
	}	
	
	public String getName() {
		return name;
	}
}
