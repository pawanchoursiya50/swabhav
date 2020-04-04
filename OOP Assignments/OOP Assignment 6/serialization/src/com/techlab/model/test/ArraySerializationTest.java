package com.techlab.model.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.model.ArraySerialization;

public class ArraySerializationTest {
	static String fileName = "myArrayFile.ser";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArraySerialization obj1 = new ArraySerialization(101, "Bob");
		ArraySerialization obj2 = new ArraySerialization(101, "jon");
		ArraySerialization obj3 = new ArraySerialization(101, "jay");
		ArraySerialization obj4 = new ArraySerialization(101, "rony");
		
		ArraySerialization[] arr = new ArraySerialization[4];
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;
		arr[3] = obj4;

		arraySerializeObject(arr);
		arrayDeserializeObject();
	}

	private static void arraySerializeObject(ArraySerialization[] arr) throws IOException {
		FileOutputStream fileOut = new FileOutputStream("account.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(arr);
        out.close();
        fileOut.close();
        
        System.out.println("Serialized data is stored in account.ser file");		
	}

	private static void arrayDeserializeObject() throws IOException, ClassNotFoundException {
		ArraySerialization[] arr = null;
		
		FileInputStream input = new FileInputStream(fileName);
		ObjectInputStream reader = new ObjectInputStream(input);
		arr = (ArraySerialization[])reader.readObject();
		System.out.println("Object has Deserialized");
		reader.close();
		
	}

}
