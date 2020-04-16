package com.techlab.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductTest {

	static int totalRows = 10;
	static int totalColumns;
	static String[][] products = new String[10][4];

	public static void main(String args[]) throws IOException {

		readFile();
		display();
		sellingPrice();

	}

	public static void readFile() throws IOException {
		String line = "";
		int rows = 0;
		String[] product = null;
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		while ((line = br.readLine()) != null) {
//			System.out.println(line);
			product = line.split(",");
			for (int i = 0; i < product.length; i++) {
				products[rows][i] = product[i];
			}
			rows++;
		}
		br.close();

		totalColumns = product.length;
	}

	public static void display() {
		for (int row = 0; row < totalRows; row++) {
			if (products[row][0] != null) {
				for (int column = 0; column < totalColumns; column++) {
						System.out.print(products[row][column] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void sellingPrice() {
		System.out.println("After Discount Price");
		System.out.println("ID   Price");

		for (int row = 1; row < totalRows; row++) {
			if (products[row][0] != null && products[row][1] != null && products[row][2] != null && products[row][3] != null) {

				double price = Double.parseDouble(products[row][2]);
				double discount = Double.parseDouble(products[row][3]);

				double sellingPrice = discount * price;

				System.out.println(products[row][0] + "  " + sellingPrice);
			}
		}
	}

}