package com.techlabs.models;

public class Test {

	public static void main(String[] args) {
		
		Folder root = new Folder("movies");
		root.addChild(new File("abc", 700, "avi"));
		root.addChild(new File("pqr", 900, "avi"));

		Folder action = new Folder("Action");
		action.addChild(new File("lmn", 800, "avi"));
		
		root.addChild(action);
		
		root.addChild(new File("xyz", 900, "avi"));

		System.out.println(root.show());
	}

}
