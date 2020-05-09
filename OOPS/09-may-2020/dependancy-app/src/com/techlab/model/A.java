package com.techlab.model;

public class A {
		
		B b;
		
		public A(B b) {
			this.b = b;
		}
		
		public void bar() {
			b.foo();
		}
		
}
