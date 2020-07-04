package com.techlabs.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		GameFactory factory = GameFactory.getInstance();

		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		List<Player> players = new ArrayList<Player>();
		players.add(new Player(Mark.O, board, "jay"));
		players.add(new Player(Mark.X, board, "pranay"));

		Game game = factory.makeGame(players, board, analyzer);

		Status status = Status.Progress;

		while (status == Status.Progress) {
			Messages.printBoard(board);
			System.out.print("'" + game.getCurrentPlayer().getMarkofPlayer() + "' enter your possition : ");
			int possition = scn.nextInt() - 1;

			status = game.play(possition);

			if (status == Status.Draw) {
				Messages.draw();
				Messages.printBoard(board);
			} else if (status == Status.Win) {
				Messages.win(game.getNextPlayer().getMarkofPlayer());
				Messages.printBoard(board);
			}
		}
		scn.close();
	}

}
