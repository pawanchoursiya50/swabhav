package com.techlab.model.test;

import com.techlab.model.A;
import com.techlab.model.B;

public class ATest {

	public static void main(String[] args) {
		
		A a = new A(new B() );
		
		a.bar();
	
	}

}
