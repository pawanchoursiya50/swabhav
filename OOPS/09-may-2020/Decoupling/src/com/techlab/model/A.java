package com.techlab.model;

public class A{

	IDecoupling obj;
	
	public A(IDecoupling obj) {
		this.obj = obj;
	}
	
	public void bar() {
		obj.foo();
	}
}
