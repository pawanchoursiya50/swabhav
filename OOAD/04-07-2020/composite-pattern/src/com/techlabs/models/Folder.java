package com.techlabs.models;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {

	private String name;
	private List<IDiskItem> children = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void addChild(IDiskItem child) {
		children.add(child);
	}

	@Override
	public String show() {
		String items = name+"\n";
		for (IDiskItem child : children) {
			items += (child.show()+"\n");
		}
//			if(items == null) {
//				items = (child.show());
//			}
//			else {
//				items += ("\n	"+child.show());
//			}

		return (items).toString();
	}

}
