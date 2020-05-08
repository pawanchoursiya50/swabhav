package com.techlab.model;

import java.util.Comparator;

public class QuntityComparator implements Comparator<ListItem>{

	@Override
	public int compare(ListItem item1 , ListItem item2) {
		return item1.getQuntity() - item2.getQuntity() ;
	}
}
