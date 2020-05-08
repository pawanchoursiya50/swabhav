package com.techlab.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortTreeSetTest {

	public static void main(String[] args) {

		TreeSet<Integer> rollNo = new TreeSet<Integer>();
		rollNo.add(5);
		rollNo.add(2);
		rollNo.add(11);
		rollNo.add(6);
		rollNo.add(1);
		rollNo.add(9);
		rollNo.add(7);
		rollNo.add(8);
		rollNo.add(10);
		
		
		System.out.println(rollNo);
		
		List<Integer> id = new ArrayList<Integer>(rollNo);
		
		Collections.sort(id);
		
		System.out.println(id);
	}

}
