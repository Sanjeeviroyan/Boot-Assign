package com.cts.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Library {
	
	@Autowired
	private Book book;
	
	public Library(Book book) {
		this.book = book;
	}

	public void displayBookDetails(){
		System.out.println(book.toString());
	}

}
