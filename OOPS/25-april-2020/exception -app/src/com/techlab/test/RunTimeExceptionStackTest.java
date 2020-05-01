package com.techlab.test;

public class RunTimeExceptionStackTest {

	public static void main(String[] args) {
		
		try {
			m1();
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Inside main");
	}

	public static void m1() {
		System.out.println("Inside method 1");

		m2();
	}

	public static void m2() {
		System.out.println("Inside method 2");

		m3();
	}

	public static void m3() {
		System.out.println("Inside method 3");
		throw new RuntimeException("Some fatal error in m3");
	}
}
