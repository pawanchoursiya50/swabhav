package com.techlab.passByValue;

public class PassByValueTest {

	public static void main(String[] args) {

		int price = 100;
		PassByValueTest obj = new PassByValueTest();

		System.out.println("price before passing argument :- " + price);

		obj.increasePrice(price);

		System.out.println("price after passing argument :- " + price);
	}

	private void increasePrice(int price) {
		price = price + 100;
	}

}
