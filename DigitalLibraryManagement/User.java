package DigitalLibraryManagement;

public class User {
	Library library;

    public User(Library library) {
        this.library = library;
    }

    //browse book
    public void browseBooks() {
        library.listBooks();
    }

    //search book
    public void searchBook(String title) {
        Book book = library.searchBook(title);
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found!!!");
        }
    }

    //issue book
    public void issueBook(String bookId, String memberId) {
        library.issueBook(bookId, memberId);
    }

    //return book
    public void returnBook(String bookId) {
        library.returnBook(bookId);
    }

    //send query
    public void sendQuery(String query) {
        System.out.println("Query sent to admin: " + query);
    }
}