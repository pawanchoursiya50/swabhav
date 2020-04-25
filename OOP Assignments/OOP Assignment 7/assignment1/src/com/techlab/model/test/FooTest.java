package com.techlab.model.test;

import com.techlab.model.*;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class FooTest {

	static int testCase, i;
	static int passingTestCase;
	static int failTestCase;
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo foo = new Foo();
		Method[] needToCall = new Method[10];
		
		Method[] methods = foo.getClass().getDeclaredMethods();

		
		//it takes all method which have @MyBeforeUnitTestCase annotation and call all method before each class
		for(Method method : methods) {
			if(method.isAnnotationPresent(MyBeforeUnitTestCase.class)) {
				needToCall[i] = method;
				i++;
			}
		}
		
		
		for (Method method : methods) {
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				testCase++;
				
				for(Method methodCall : needToCall) {
					if(methodCall != null) {
						methodCall.invoke(foo);
					}
				}
				
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
