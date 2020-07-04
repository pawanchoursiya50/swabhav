package com.techlabs.frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {
	
	MainFrame frame;

	public CommonListener(MainFrame frame) {
		System.out.println("object of CommonListener is created");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent obj) {
		if (obj.getSource() == frame.getRed())
			frame.getPanel().setBackground(Color.red);
		else
			frame.getPanel().setBackground(Color.green);
	}

}