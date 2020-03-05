package com.techlab.arguments;

public class ArgumentTest {

	public static void main(String[] names) {

		System.out.println("Lenght of arguments is :- " + names.length);

		System.out.println(names);
		
		for (String name : names) {
			name = name.concat("Aurion Pro");
		}
		
		for (String name : names) {
			System.out.print(name +"\t");
		}System.out.println();
		
		for(int i=0; i<names.length; i++) {
			names[i] = names[i].concat(" AurionPro");
		}
		
		for(String name : names) {
			System.out.print(name +"\t");
		}System.out.println();
		
		
		//String[] copy = new String[names.length];
		String[] copy = names;
		
		for(int i=0; i<names.length; i++) {
			copy[i] = names[i];
		}
		
//		System.out.println(copy);
//		for(String name : copy) {
//			System.out.println(name);
//		}
		
		
		names[0] = "Agile in a Nutshell";
		System.out.println("From name :- "+ names[0]);
		System.out.println("From copy :- "+ copy[0]);

		copy[3] = "swabhav techlab";
		System.out.println("first name :-" +names[3]);
		
	}

}
