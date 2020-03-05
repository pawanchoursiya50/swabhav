package com.techlab.filehandling.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingTest {

	public static void main(String[] args) throws IOException {

		File myFile = new File("AboutJava.txt");

		// creating new file
		if (myFile.createNewFile()) {
			System.out.println("file is created");
		} else {
			System.out.println("Not created");
		}

		// Reading from file
		if (myFile.exists()) {
			System.out.println("Name of the file is : " + myFile.getName());
		} else {
			System.out.println("File is not present");
		}

		// Writing to file
		if (myFile.canWrite()) {
			FileWriter writer = new FileWriter(myFile, true);
			writer.write("java support the oop concept ");
			writer.close();
		} else {
			System.out.println("Can't write into file");
		}

		// Reading from the file character wise
		if (myFile.canRead()) {
			FileReader reader = new FileReader(myFile);
			int Charater;
			
			while ((Charater = reader.read()) != -1) {
				System.out.println((char) Charater);
			}
		} else {
			System.out.println("Can't write into file");
		}

		// Reading from the file line wise
		if (myFile.canWrite()) {
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			reader.close();
		} else {
			System.out.println("Can't write into file");
		}

	}

}
