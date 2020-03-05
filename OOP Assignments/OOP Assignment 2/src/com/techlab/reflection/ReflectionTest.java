package com.techlab.reflection;

import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {

		Object obj = new Object();

		Class objClass = obj.getClass();
		System.out.println("the name of class is :- " + objClass.getSimpleName() + "\n");

		Constructor objConstructore = objClass.getConstructor();
		System.out.println("Constructor of Object class is :- " + objConstructore.getName() + "\n");

		System.out.println("\nAll methods of Object class are :- ");
		Method[] objMethod = objClass.getMethods();
		for (Method method : objMethod) {
			System.out.println(method.getName());
		}

		System.out.println("\n\n All variables of Object class :- ");
		Field[] objVariables = objClass.getFields();
		for (Field variable : objVariables) {
			System.out.println(variable);
		}
		

	}

}
