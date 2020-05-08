package com.techlab.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.techlab.model.ListItem;

public class LineItemTest {

	public static void main(String[] args) {

		case1();
		case2();

		
//		String n1 = new String("pawan");
//		String n2 = new String("pawan");
//		
//		System.out.println( n1 == n2 );
//		System.out.println( n1.equals(n2));
//		
//		String name1 = "pawan"; 
//		String name2 = "pawan";
//		
//		System.out.println( name1 == name2 );
//		System.out.println( name1.equals(name2));
		
		
	}

	private static void case1() {
		HashSet<String> names = new HashSet<String>();
		names.add("swabhav");
		names.add("swabhav");
		names.add( new String("swabhav") );
		names.add( new String("swabhav") );

		System.out.println(names.size());

	}

	private static void case2() {
		HashSet<ListItem> items = new HashSet<ListItem>();
		items.add(new ListItem(101, "NLP", 100, 10));
		items.add(new ListItem(102, "NLP", 100, 10));
		items.add(new ListItem(102, "NLP", 100, 10));
		items.add(new ListItem(102, "NLP", 100, 10));
		items.add(new ListItem(102, "NLP", 100, 10));

		ListItem item = new ListItem(103, "DS", 180, 20);
		items.add(item);
		items.add(item);

		System.out.println(items.size());
	}

}
