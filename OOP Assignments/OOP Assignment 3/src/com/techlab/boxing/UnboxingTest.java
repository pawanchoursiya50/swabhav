package com.techlab.boxing;

public class UnboxingTest {

	public static void main(String[] args) {
		
		//Boxing
		Integer mark1 = new Integer(68);
		Integer mark2 = new Integer(83);
		Integer mark3 = new Integer(78);
		Integer mark4 = new Integer(77);
		
		//UnBoxing
		int unBoxMark1 = mark1.intValue();
		int unBoxMark2 = mark2.intValue();
		int unBoxMark3 = mark3.intValue();
		int unBoxMark4 = mark4.intValue();
		
		System.out.println("mark1 :- " + unBoxMark1);
		System.out.println("mark2 :- " + unBoxMark2);
		System.out.println("mark3 :- " + unBoxMark3);
		System.out.println("mark4 :- " + unBoxMark4);
		
		
	}

}
