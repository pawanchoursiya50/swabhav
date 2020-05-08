package com.techlab.model.test;

import java.awt.event.ItemListener;
import java.util.Collections;
import java.util.TreeSet;

import com.techlab.model.ListItem;
import com.techlab.model.NameComparator;
import com.techlab.model.PriceComparator;
import com.techlab.model.QuntityComparator;

public class LineItemTest {

	public static void main(String[] args) {

		case1();
		case2();
		
		case3();
		case4();
		case5();
	}

	private static void case1() {
		TreeSet<String> names = new TreeSet<String>();
		names.add("swabhav");
		names.add("techlab");

		System.out.println("size is "+ names.size());
		System.out.println(names +"\n");

	}

	private static void case2() {
		System.out.println("Sort by id");

		TreeSet<ListItem> items = new TreeSet<ListItem>();
		
		items.add(new ListItem(101, "NLP", 110, 50));
		items.add(new ListItem(102, "ML", 110, 12));
		items.add(new ListItem(103, "NLP", 500, 5));
		items.add(new ListItem(104, "ML", 200, 20));

		System.out.println("Size is "+ items.size());
		
		for(ListItem item : items) {
			System.out.println(item.toString());
		}
		System.out.println();
	}
	
	private static void case3() {
		System.out.println("Sort by Price");

		TreeSet<ListItem> items = new TreeSet<ListItem>(new PriceComparator());
		items.add(new ListItem(101, "NLP", 110, 50));
		items.add(new ListItem(102, "ML", 110, 12));
		items.add(new ListItem(103, "NLP", 500, 5));
		items.add(new ListItem(104, "ML", 200, 20));
		
		for(ListItem item : items) {
			System.out.println(item.toString());
		}
		System.out.println();

	}
	
	private static void case4() {
		System.out.println("Sort by Name");

		TreeSet<ListItem> items = new TreeSet<ListItem>(new NameComparator());
		items.add(new ListItem(101, "NLP", 110, 50));
		items.add(new ListItem(102, "ML", 110, 12));
		items.add(new ListItem(103, "NLP", 500, 5));
		items.add(new ListItem(104, "ML", 200, 20));
		
		for(ListItem item : items) {
			System.out.println(item.toString());
		}
		System.out.println();

	}
	
	private static void case5() {
		System.out.println("Sort by Quntity");

		TreeSet<ListItem> items = new TreeSet<ListItem>(new QuntityComparator());
		items.add(new ListItem(101, "NLP", 110, 50));
		items.add(new ListItem(102, "ML", 110, 12));
		items.add(new ListItem(103, "NLP", 500, 5));
		items.add(new ListItem(104, "ML", 200, 20));
		items.add(new ListItem(103, "NLP", 500, 5));
		items.add(new ListItem(104, "ML", 200, 20));
		
		for(ListItem item : items) {
			System.out.println(item.toString());
		}
	}

}
