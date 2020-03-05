package com.techlab.MagicNumber;

public class WithMagicNumberTest {

	public static void main(String[] args) {

		// Find the given year is Leap year or not
		int year = 2020;
		boolean flage = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flage = true;
				}
			} else {
				flage = true;
			}
		}
		
		if(flage)
			System.out.println(year +" is leap year");
		else
			System.out.println(year +" is not leap year");
	}

}
