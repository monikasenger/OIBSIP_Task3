package DigitalLibraryManagement;

public class Admin {
	Library library;

    public Admin(Library library) {
        this.library = library;
    }

    //add book
    public void addBook(String bookId, String title, String author) {
        Book book = new Book(bookId, title, author);
        library.addBook(book);
    }

    //remove book
    public void removeBook(String bookId) {
        library.removeBook(bookId);
    }

    
    //add memeber
    public void addMember(String memberId, String name, String email) {
        Member member = new Member(memberId, name, email);
        library.addMember(member);
    }

    //remove member
    public void removeMember(String memberId) {
        library.removeMember(memberId);
    }

    //view all book
    public void viewAllBooks() {
        library.listBooks();
    }

    //view all member
    public void viewAllMembers() {
        library.listMembers();
    }
}