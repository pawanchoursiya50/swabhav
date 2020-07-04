package com.techlab.model.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlab.model.Board;
import com.techlab.model.Game;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.ResultAnalyzer;
import com.techlab.model.Status;
import com.techlab.model.Messages;

public class GameTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		List<Player> players = new ArrayList<Player>();
		players.add(new Player(Mark.O, board, "jay"));
		players.add(new Player(Mark.X, board, "pranay"));
		
		Game game = new Game(players, board, analyzer);
		
		Status status = Status.Progress;
		
		while(status == Status.Progress) {
			Messages.printBoard(board);
			System.out.print("'"+game.getCurrentPlayer().getMarkofPlayer() +"' enter your possition : ");
			int possition = scn.nextInt()-1;
			
			status = game.play(possition);
			
			if (status == Status.Draw) {
				Messages.draw();
				Messages.printBoard(board);
			} 
			else if (status == Status.Win) {
				Messages.win(game.getNextPlayer().getMarkofPlayer());
				Messages.printBoard(board);
			}
		}
		
		scn.close();
		
	}

}
