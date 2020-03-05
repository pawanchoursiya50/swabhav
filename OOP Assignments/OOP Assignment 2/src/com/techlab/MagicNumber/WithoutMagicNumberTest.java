package com.techlab.MagicNumber;

public class WithoutMagicNumberTest {

	public static void main(String[] args) {
		int year = 2019;
		boolean flage = false;
		int FOR_CENTURY = 400;
		int FOR_NORMAL_YEAR =4;
		int ENDS_WITH_00 = 100;

		if (year % FOR_NORMAL_YEAR == 0) {
			if (year % ENDS_WITH_00 == 0) {
				if (year % FOR_CENTURY == 0) {
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
