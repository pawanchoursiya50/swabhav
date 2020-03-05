package com.techlab.model.test;

import java.lang.reflect.Method;

import com.techlab.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.changeWidth(199);
		rectangle.changeHeigth(-23);

		System.out.printf("Width is = %d, Heigth is : %d", rectangle.readWidth(), rectangle.readHeigth());

		Rectangle[] rectangles = new Rectangle[5];
		displayArrayElements(rectangles);

		displayMethodName(Rectangle.class);
		displayMethodName(RectangleTest.class);
		displayMethodName(Integer.class);
		
		System.out.println("\n"+ new Rectangle().readWidth());
	}

	private static void displayMethodName(Class class1) {
		Method[] methods = class1.getDeclaredMethods();

		System.out.println("\n\nTotal no of methos are : " + methods.length);
		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}

	private static void displayArrayElements(Rectangle[] rectangles) {
		System.out.println("\n\n" + rectangles[0]);
		for (Rectangle r : rectangles) {
			System.out.println(r);
		}
	}

}
