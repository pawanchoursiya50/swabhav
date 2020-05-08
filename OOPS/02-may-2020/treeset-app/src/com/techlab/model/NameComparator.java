package com.techlab.model;

import java.util.Comparator;

public class NameComparator implements Comparator<ListItem>{

	@Override
	public int compare(ListItem item1, ListItem item2) {
		return item1.getName().compareToIgnoreCase(item2.getName());
	}
}
