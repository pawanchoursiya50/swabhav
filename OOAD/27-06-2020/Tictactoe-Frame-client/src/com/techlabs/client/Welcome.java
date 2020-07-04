package com.techlabs.client;

import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Welcome extends JFrame {

	TextField player1, player2;

	public Welcome() {
		super("Welcome");
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		Panel panel = new Panel();

		Label label1 = new Label("Player1 : ");
		player1 = new TextField(10);
		panel.add(label1);
		panel.add(player1);

		Label label2 = new Label("Player2 : ");
		player2 = new TextField(10);
		panel.add(label2);
		panel.add(player2);

		JButton button = new JButton("Next");
		panel.add(button);

		this.add(panel);

		button.addActionListener(new MainFrame(this));

	}

	public TextField getPlayer1() {
		return player1;
	}

	public TextField getPlayer2() {
		return player2;
	}

}
