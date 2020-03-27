package com.techlab.model;

public class Rectangle {
	private int width;
	private int height;
	
	private final int UPPER_LIMIT = 100;
	private final int LOWER_LIMIT = 1;

	public void changeWidth(int pWidth) {
		if (pWidth > UPPER_LIMIT) {
			width = UPPER_LIMIT;
		} else if (pWidth < LOWER_LIMIT) {
			width = LOWER_LIMIT;
		} else {
			width = pWidth;
		}
	}

	 //violation of dry principle in both methods
	public void changeHeigth(int pHeigth) {
		if (pHeigth > UPPER_LIMIT) {
			pHeigth = UPPER_LIMIT;
		} else if (pHeigth < LOWER_LIMIT) {
			pHeigth = LOWER_LIMIT;
		}

		height = pHeigth;
	}

	public int readWidth() {
		return width;
	}

	public int readHeigth() {
		return height;
	}
}
