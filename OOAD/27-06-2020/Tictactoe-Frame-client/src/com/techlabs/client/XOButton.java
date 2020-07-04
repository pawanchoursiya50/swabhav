package com.techlabs.client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.techlabs.model.Mark;
import com.techlabs.model.Status;

public class XOButton extends JButton implements ActionListener {
	static ImageIcon X, O;
	static Status status;
	int cellNo;
	boolean clicked = false;

	public XOButton(int cellNo) {
		this.cellNo = cellNo;
		X = new ImageIcon("./images/x.png");
		O = new ImageIcon("./images/o.png");
		setBackground(Color.WHITE);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (clicked != true) {
			clicked = true;
			if (MainFrame.game.getCurrentPlayer().getMarkofPlayer() == Mark.O) {
				setIcon(O);
			} else {
				setIcon(X);
			}
			status = MainFrame.game.play(cellNo);
			if (status == status.Win) {
				MainFrame.win.setText(MainFrame.game.getNextPlayer().getName() + " Win this match!!!");
				for (XOButton btn : MainFrame.buttons) {
					if (btn.clicked == false)
						btn.setEnabled(false);
				}
			} else {
				set();
			}

		} else {
			System.out.println("this place is not Empty, please choose another place");
		}
	}

	public static void set() {
		MainFrame.currName.setText("Current player : " + MainFrame.game.getCurrentPlayer().getName());
		MainFrame.status.setText("Status : " + status);

	}

}
