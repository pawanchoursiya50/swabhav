package com.techlab.model.test;

import com.techlab.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(12, 34, "GREEN");
		display(rec1);
		
		Rectangle rec2 = new Rectangle(12, -34, null);
		display(rec2);
			
		Rectangle rec3 = new Rectangle(-13, -15);
		display(rec3);
		
		Rectangle rec4 = new Rectangle(-10, 5, "grEen");
		display(rec4);
		
		Rectangle rec5 = new Rectangle(0, 0, "orange");
		display(rec5);
	}
	
	static void display(Rectangle rectengle) {
		System.out.println("Heigth = "+ rectengle.getWidth()+ " Width = "+rectengle.getHeigth()+ " Color = "+rectengle.getColor());
		System.out.println("Area of rectangle is = "+rectengle.CalculateArea() +"\n");
	}

}
