package com.techlab.model.test;

import com.techlab.model.*;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class FooTest {

	static int testCase;
	static int passingTestCase;
	static int failTestCase;
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo foo = new Foo();
		Method[] methods = foo.getClass().getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				testCase++;
				if ((boolean) method.invoke(foo)) {
					passingTestCase++;
				} else
					failTestCase++;
			} 
		}
		
		System.out.println("Total number of Test cases is : " + testCase);
		System.out.println("Number of Test cases which are pass is : " + passingTestCase);
		System.out.println("Number of Test cases which are fail is : " + failTestCase);

	}

}
