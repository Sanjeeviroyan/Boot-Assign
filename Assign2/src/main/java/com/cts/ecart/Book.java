package com.cts.ecart;

public class Book {

	 private String BookTitle;
	 private String Bookauthor ;
	 

	public Book() {
		
	}

	public Book(String bookTitle, String bookauthor) {
		BookTitle = bookTitle;
		Bookauthor = bookauthor;
	}

	public String getBookTitle() {
		return BookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	
	public String getBookauthor() {
		return Bookauthor;
	}
	
	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}
	
	@Override
	public String toString() {
		return "Book [BookTitle=" + BookTitle + ", Bookauthor=" + Bookauthor + "]";
	}
	
}
