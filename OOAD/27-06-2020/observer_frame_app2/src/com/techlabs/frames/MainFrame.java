package com.techlabs.frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private JPanel panel;
	private JButton red, green;

	public MainFrame() {
		super("Swabhav");
		this.setVisible(true);
		this.setSize(500, 500);

		panel = new JPanel();
		red = new JButton("Red");
		green = new JButton("Green");

		panel.add(red);
		panel.add(green);
		this.add(panel);

		CommonListener listener = new CommonListener(this);
		red.addActionListener(listener);
		green.addActionListener(listener);

	}

	public JPanel getPanel() {
		return panel;
	}

	public JButton getRed() {
		return red;
	}

	public JButton getGreen() {
		return green;
	}

}