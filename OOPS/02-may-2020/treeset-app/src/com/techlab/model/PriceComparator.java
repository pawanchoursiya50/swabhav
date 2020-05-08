package com.techlab.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<ListItem>{

	@Override
	public int compare(ListItem item1, ListItem item2) {
		return (int) (item1.getPrice() - item2.getPrice()) ;
	}

}
