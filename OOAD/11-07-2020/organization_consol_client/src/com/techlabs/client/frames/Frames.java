package com.techlabs.client.frames;

import javax.swing.JFrame;
import javax.swing.JTree;

import com.techlabs.components.Employee;
import com.techlabs.components.OrgHierarchyBuilder;

public class Frames extends JFrame {
	
	public Frames(OrgHierarchyBuilder builder) {
		super("Hierarchy");
		setVisible(true);
		setSize(500, 700);
		
		Employee ceo = builder.getCEO();
		
		JTree tree = new JTree(ceo.buidJFrameHierarchy());
		add(tree);
		

		

	}
	
}
