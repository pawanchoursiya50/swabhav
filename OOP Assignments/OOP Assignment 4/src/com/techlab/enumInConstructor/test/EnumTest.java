package com.techlab.enumInConstructor.test;

enum Fruit{
	apple("red"),
	banana("yellow"),
	blueberry("blue");
	
	final String color;
	Fruit(String color){
		this.color = color;
	}
}

public class EnumTest {
	public static void main(String[] args) {
		Fruit fruit1 = Fruit.apple;
		Fruit fruit2 = Fruit.banana;
		Fruit fruit3 = Fruit.blueberry;
		
		System.out.println(fruit1 +" : "+fruit1.color);
		System.out.println(fruit2 +" : "+fruit2.color);
		System.out.println(fruit3 +" : "+fruit3.color);
	}
	
}
