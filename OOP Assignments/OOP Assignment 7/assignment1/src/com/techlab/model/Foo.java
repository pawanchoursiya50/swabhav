package com.techlab.model;


public class Foo {

	@UnitTestCase 
	public boolean m1() {
		return true;
	}
	
	@UnitTestCase
	public boolean m2() {
		return true;
	}
	
	@UnitTestCase
	public boolean m3() {
		return false;
	}
	
	@UnitTestCase
	public boolean m4() {
		return true;
	}
	
	@MyBeforeUnitTestCase
	public void bar() {
		System.out.println("Befoer called");
	}
}
