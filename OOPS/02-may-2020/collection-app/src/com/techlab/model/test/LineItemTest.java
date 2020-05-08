package com.techlab.model.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlab.model.ListItem;

public class LineItemTest {

	public static void main(String[] args) {

		case1();
		case2();
	}

	private static void case1() {

		ArrayList cart = new ArrayList();
		cart.add(new ListItem(101, "NLP", 100, 10));
		cart.add(new ListItem(102, "DS", 120, 10));
		cart.add(new ListItem(103, "ML", 110, 10));
		cart.add("swabhav");

		double totalCost = 0;

		for (Object item : cart) {
			if (item instanceof ListItem) {

				ListItem list = (ListItem) item;

				System.out.println(list.calculateTotal());
				totalCost += (list.calculateTotal());
			}
		}

		System.out.println("Total checkout cost is ::- " + totalCost);

	}
	
	private static void case2() {
		ArrayList<ListItem> cart = new ArrayList();
		cart.add(new ListItem(101, "NLP", 100, 10));
		cart.add(new ListItem(102, "DS", 120, 10));
		cart.add(new ListItem(103, "ML", 110, 10));

		double totalCost = 0;

		for (ListItem item : cart) {

				System.out.println(item.calculateTotal());
				totalCost += (item.calculateTotal());
		}

		System.out.println("Total checkout cost is ::- " + totalCost);
	}

}

