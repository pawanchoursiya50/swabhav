package com.techlab.model.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Alphabet {

	public static void main(String[] args) {

		LinkedList<Character> alphabets = new LinkedList();
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		printInfo(alphabets);
		
		
		//Checking and removing a particular element
		if(alphabets.contains('a')) {
			alphabets.remove((Character)'a');
		}
		
		alphabets.addFirst('a');
		alphabets.addLast('z');
		
		//iterate through iterator()
		Iterator<Character> list = alphabets.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		//removing all elements of LinkedList
		alphabets.clear();
		System.out.println(alphabets);

	}

	private static void printInfo(List<Character> alphabets) {
		System.out.println(alphabets);
	}

}
