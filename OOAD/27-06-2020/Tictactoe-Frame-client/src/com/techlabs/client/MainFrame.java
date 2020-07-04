package com.techlabs.client;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.GameFactory;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyzer;

public class MainFrame extends JFrame implements ActionListener {

	Welcome wFrame;
	Panel panel1, panel2;
	static Game game;
	static Label currName, win, status;
	static List<XOButton> buttons = new ArrayList<XOButton>();

	public MainFrame(Welcome wFrame) {
		super("Tic-Tac-Toe");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel1 = new Panel();
		panel2 = new Panel();
		panel2.setLayout(new GridLayout(4, 3));

		this.wFrame = wFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		setVisible(true);

		Board board = new Board();
		Player ply1 = new Player(Mark.X, board, wFrame.getPlayer1().getText());
		Player ply2 = new Player(Mark.O, board, wFrame.getPlayer2().getText());
		List<Player> player = new ArrayList<Player>();
		player.add(ply1);
		player.add(ply2);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		GameFactory factory = GameFactory.getInstance();
		game = factory.makeGame(player, board, analyzer);

		currName = new Label();
		status = new Label();
		win = new Label();

		panel2.add(currName);
		panel2.add(status);
		panel2.add(win);

		XOButton.set();

		for (int i = 0; i < 9; i++) {
			XOButton btn = new XOButton(i);
			buttons.add(btn);
			panel2.add(btn);
		}
		add(panel2);

	}

	public Label getWin() {
		return win;
	}

	public static Label getCurrName() {
		return currName;
	}

	public Label getStatus() {
		return status;
	}

}
