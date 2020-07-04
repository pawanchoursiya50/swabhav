package com.techlabs.frames;

import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;


public class NameFrame extends JFrame{

	TextField tField;
	
	public NameFrame() {
		super("NameFrame");
		this.setVisible(true);
		this.setSize(500, 500);
		
		Panel panel = new Panel();
		
		Label name = new Label("Name : ");
		panel.add(name);
		
		tField = new TextField(10);
		panel.add(tField);
		
		JButton button = new JButton("Next");
		panel.add(button);
		
		this.add(panel);
		
		button.addActionListener(new WelcomeFrame(this));

	}

	public TextField getTf() {
		return tField;
	}
}
