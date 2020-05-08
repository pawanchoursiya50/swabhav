package com.techlab.model.test;

import java.util.Collections;
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
		
//		Collections.sort(rollNo);
		
		System.out.println(rollNo);
	}

}
