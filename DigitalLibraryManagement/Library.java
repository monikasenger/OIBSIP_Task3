package DigitalLibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
	 List<Book> books = new ArrayList<>();
	    List<Member> members = new ArrayList<>();

	    //add books
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added successfully!!!");
	    }

	    
	    //remove books
	    public void removeBook(String bookId) {
	        books.removeIf(book -> book.bookId.equals(bookId));
	        System.out.println("Book removed successfully!!!");
	    }

	    
	    //add members
	    public void addMember(Member member) {
	        members.add(member);
	        System.out.println("Member added successfully!!!");
	    }

	    
	    //remove member
	    public void removeMember(String memberId) {
	        members.removeIf(member -> member.memberId.equals(memberId));
	        System.out.println("Member removed successfully!!!");
	    }

	    //book list
	    public void listBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books available!!!");
	        } else {
	            books.forEach(System.out::println);
	        }
	    }

	    //member list
	    public void listMembers() {
	        if (members.isEmpty()) {
	            System.out.println("No members found!!!");
	        } else {
	            members.forEach(System.out::println);
	        }
	    }

	    //search book
	    public Book searchBook(String title) {
	        for (Book book : books) {
	            if (book.title.equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    //book issue
	    public boolean issueBook(String bookId, String memberId) {
	        for (Book book : books) {
	            if (book.bookId.equals(bookId) && !book.isIssued) {
	                book.isIssued = true;
	                System.out.println("Book issued successfully to member: " + memberId);
	                return true;
	            }
	        }
	        System.out.println("Book is already issued or does not exist!!!");
	        return false;
	    }

	    //book return
	    public boolean returnBook(String bookId) {
	        for (Book book : books) {
	            if (book.bookId.equals(bookId) && book.isIssued) {
	                book.isIssued = false;
	                System.out.println("Book returned successfully!!!");
	                return true;
	            }
	        }
	        System.out.println("Book is not issued or does not exist!!!");
	        return false;
	    }
	}