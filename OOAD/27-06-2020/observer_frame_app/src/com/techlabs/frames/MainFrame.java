  
package com.techlabs.frames;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Swabhav");
		this.setVisible(true);
		this.setSize(500, 500);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("click button");
		panel.add(button);
		this.add(panel);
		
		button.addActionListener(new EmailListener());
		button.addActionListener(new SMSListener());

	}

}