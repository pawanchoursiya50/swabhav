package com.techlab.model;

public class Rectangle {

	private int width;
	private int heigth;
	private String color;
	private final String DEFAULT_COLOR = "RED";

	public Rectangle(int pWidth, int pHeigth, String pColor) {
		width = checkNegativeValue(pWidth);
		heigth = checkNegativeValue(pHeigth);
		color = checkColor(pColor);
	}
	
	public Rectangle(int pWidth, int pHeigth) {
		width = checkNegativeValue(pWidth);
		heigth = checkNegativeValue(pHeigth);
		color = "RED";
	}

	private int checkNegativeValue(int diamention) {
		if(diamention <= 0)
		{
			diamention = 1;
		}
		return diamention;
	}

	private String checkColor(String pColor) {
		if(pColor == null) {
			return DEFAULT_COLOR;
		}
		
		String color = pColor.toUpperCase();
		if (!color.equals("RED") && !color.equals("GREEN") && !color.equals("BLUE")) {

			color = DEFAULT_COLOR;
		}

		return color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}

	public String getColor() {
		return color;
	}

	public int CalculateArea() {
		return (int) (width * heigth * 0.5);
	}

}
