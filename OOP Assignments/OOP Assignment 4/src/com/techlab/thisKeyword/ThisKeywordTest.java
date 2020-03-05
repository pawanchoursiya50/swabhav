package com.techlab.thisKeyword;

public class ThisKeywordTest {

	String name;
	int roll;
	String clg;

	ThisKeywordTest() {
		System.out.println("this is default constructor");
	}

	ThisKeywordTest(String name, int roll) {
		this();
		this.name = name;
		this.roll = roll;
	}

	ThisKeywordTest(String name, int roll,  String clg) {
		this(name,roll);
		this.clg = clg;
	}

	public static void main(String[] args) {
		
		ThisKeywordTest obj = new ThisKeywordTest("Pawan", 8, "Vishwaniketan");
		
		System.out.println("name = "+ obj.name);
		System.out.println("roll no = "+ obj.roll);
		System.out.println("college name = "+ obj.clg);

	}

}
