package com.techlab.model;

public class Rectangle {

	public int width;
	public int heigth;

	public int calculateArea() {

		return (Math.abs(width) * heigth);
	}
}
