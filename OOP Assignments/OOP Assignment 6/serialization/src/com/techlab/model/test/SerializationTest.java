package com.techlab.model.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.model.Serialization;

public class SerializationTest {
	
	static String fileName = "myFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Serialization obj = new Serialization(101, "bob");
		
		serializeObject(obj);
		deserializeObject();
	}

	

	static void serializeObject(Serialization obj) throws IOException {
		
		FileOutputStream out = new FileOutputStream(fileName);
		ObjectOutputStream writter = new ObjectOutputStream(out);
		writter.writeObject(obj);
		System.out.println("Object has Serialized");

		writter.close();
	}

	static void deserializeObject() throws IOException, ClassNotFoundException {
		Serialization object = null;
		
		FileInputStream input = new FileInputStream(fileName);
		ObjectInputStream reader = new ObjectInputStream(input);
		
		object = (Serialization)reader.readObject();
		System.out.println("Object has Deserialized");
		reader.close();
		
	}
}
