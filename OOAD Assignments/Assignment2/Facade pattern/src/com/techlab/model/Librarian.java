package com.techlab.model;

public class Librarian {

	public Book getComicBook() {
		return new Comicbook();
	}
	
	public Book getCrimeBook() {
		return new CrimeBook();
	}
	
	public Book getDramaBook() {
		return new Dramabook();
	}
	
	public Book getPoetryBook() {
		return new Poetrybook();
	}

}
