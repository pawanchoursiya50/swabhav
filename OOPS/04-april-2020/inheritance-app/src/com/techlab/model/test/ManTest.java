package com.techlab.model.test;

import com.techlab.model.*;

public class ManTest {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		
	}

	private static void case1() {
		Man x = new Man();
		x.play();
		x.read();
		x.walk();
	}

	private static void case2() {
		Boy y = new Boy();
		y.play();
		y.eat();
	}
	
	private static void case3() {
		Man x = new Boy();
		x.play();
		x.read();
		x.walk();
	}
	
	private static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	
	static void atThePark(Man x) {
		System.out.println("At the Park");
		x.play();
	}
	
	private static void case5() {
		
		Object x;
		
		x = 10;
		System.out.println(x.getClass());
		
		x = 10.5;
		System.out.println(x.getClass());
		
		x = "Hello";
		System.out.println(x.getClass());
		
		x = new Integer(20);
		System.out.println(x.getClass());
	}

}
