package com.techlab.string;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "Pawan";
		String fullName = name;
		
		System.out.println(name);
		System.out.println(fullName);
		
		
		//Here fullName have changed but name is still unchanged
		//If String was not immutable then while changing the fullName, name will also change
		//which is violation of security and we don't want this thing to happen.
		fullName = "Pawan Choursiya";
		
		System.out.println(name);
		System.out.println(fullName);
		
	}

}
