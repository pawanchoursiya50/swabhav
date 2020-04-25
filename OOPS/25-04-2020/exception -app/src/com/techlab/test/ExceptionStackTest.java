package com.techlab.test;

public class ExceptionStackTest {

	public static void main(String[] args) {

		try{
			m1();
		}
		catch(Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("Inside main");
	}
	
	public static void m1() throws Exception{
		System.out.println("Inside method 1");

		m2();
	}
	
	public static void m2() throws Exception{
		System.out.println("Inside method 2");

		m3();
	}
	
	public static void m3() throws Exception{
		System.out.println("Inside method 3");
		throw new Exception("some fatal error in m3");
	}

}
