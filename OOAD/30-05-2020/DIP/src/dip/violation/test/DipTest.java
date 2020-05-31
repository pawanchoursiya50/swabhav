package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculater;

public class DipTest {

	public static void main(String[] args) {

		TaxCalculater cal = new TaxCalculater(LogType.XML);
		
		System.out.println("result : "+ cal.calculateTax(20,  10));

		System.out.println("result : "+ cal.calculateTax(20,  0));
	}

}
