package com.techlabs.models;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiscItem {

	private String name;
	private List<IDiscItem> children = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void addChild(IDiscItem child) {
		children.add(child);
	}
	

	@Override
	public String show(int level) {
		String folderItems = addLevelSpaces(level)+this.name + "\n";
		
		for (IDiscItem child : children) {
			if(child instanceof File)
			folderItems = folderItems + addLevelSpaces(level+1)+child.show(level)+'\n';
			else
				folderItems = folderItems + child.show(level+1);
				
		}
		return folderItems;

	}

	public String addLevelSpaces(int level) {
		String spaces = "";
		for (int i = 0; i < level; i++) {
			spaces = spaces + "\t";

		}
		return spaces;
	}

}
