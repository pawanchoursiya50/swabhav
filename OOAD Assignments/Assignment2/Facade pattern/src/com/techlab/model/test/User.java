package com.techlab.model.test;

import com.techlab.model.Book;
import com.techlab.model.Librarian;

public class User {

	public static void main(String[] args) {

		Librarian lib = new Librarian();
		
		Book book1= lib.getComicBook();
		book1.read();
		
		Book book2= lib.getCrimeBook();
		book2.read();
		
		Book book3= lib.getDramaBook();
		book3.read();
		
		Book book4= lib.getPoetryBook();
		book4.read();
	}

}
