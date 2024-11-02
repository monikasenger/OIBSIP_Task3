package DigitalLibraryManagement;

public class Book {
	   String bookId;
	    String title;
	    String author;
	    boolean isIssued;

	    public Book(String bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
	    }

	    @Override
	    public String toString() {
	        return "BookID:-> " + bookId + ", Title:-> " + title + ", Author:-> " + author + ", Issued:-> " + (isIssued ? "Yes" : "No");
	    }
	}