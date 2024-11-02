package DigitalLibraryManagement;

import java.util.Scanner;

public class DigitalLibraryManagement {
	
	public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin(library);
        User user = new User(library);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n**********DIGITAL LIBRARY MANAGEMENT**********");
        
        while (true) {
            System.out.println("\n1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            //admin module
            if (option == 1) {
                System.out.println("\n-----Admin Module-----");
                while (true) {
                    System.out.println("\n1. Add Book");
                    System.out.println("2. Remove Book");
                    System.out.println("3. Add Member");
                    System.out.println("4. Remove Member");
                    System.out.println("5. View All Books");
                    System.out.println("6. View All Members");
                    System.out.println("7. Logout");
                    System.out.print("Select an option: ");
                    int adminOption = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (adminOption) {
                    
                        case 1://add book
                            System.out.print("\nEnter Book ID: ");
                            String bookId = sc.nextLine();
                            System.out.print("Enter Book Title: ");
                            String title = sc.nextLine();
                            System.out.print("Enter Book Author: ");
                            String author = sc.nextLine();
                            admin.addBook(bookId, title, author);
                            break;
                            
                        case 2://remove book
                            System.out.print("\nEnter Book ID to remove: ");
                            String removeBookId = sc.nextLine();
                            admin.removeBook(removeBookId);
                            break;
                            
                        case 3://add member
                            System.out.print("\nEnter Member ID: ");
                            String memberId = sc.nextLine();
                            System.out.print("Enter Member Name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter Member Email: ");
                            String email = sc.nextLine();
                            admin.addMember(memberId, name, email);
                            break;
                            
                        case 4://remove member
                            System.out.print("\nEnter Member ID to remove: ");
                            String removeMemberId = sc.nextLine();
                            admin.removeMember(removeMemberId);
                            break;
                            
                        case 5://view all book
                            admin.viewAllBooks();
                            break;
                            
                        case 6://view all member
                            admin.viewAllMembers();
                            break;
                            
                        case 7://logout 
                            System.out.println("Admin logged out!!!");
                            break;
                            
                        default:
                            System.out.println("Invalid option. Try again!!!");
                    }
                    if (adminOption == 7) break;
                }
            }
           
            //user module 
            else if (option == 2) {
                System.out.println("\n-----User Module-----");
                
                while (true) {
                    System.out.println("\n1. Browse Books");
                    System.out.println("2. Search Book");
                    System.out.println("3. Issue Book");
                    System.out.println("4. Return Book");
                    System.out.println("5. Send Query");
                    System.out.println("6. Logout");
                    System.out.print("Select an option: ");
                    int userOption = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (userOption) {
                        case 1://browse book
                            user.browseBooks();
                            break;
                            
                        case 2://search book
                            System.out.print("\nEnter Book Title to search: ");
                            String searchTitle = sc.nextLine();
                            user.searchBook(searchTitle);
                            break;
                            
                        case 3://issue book
                            System.out.print("\nEnter Book ID to issue: ");
                            String issueBookId = sc.nextLine();
                            System.out.print("Enter Member ID: ");
                            String memberId = sc.nextLine();
                            user.issueBook(issueBookId, memberId);
                            break;
                            
                        case 4://return book
                            System.out.print("\nEnter Book ID to return: ");
                            String returnBookId = sc.nextLine();
                            user.returnBook(returnBookId);
                            break;
                            
                        case 5://send query
                            System.out.print("\nEnter your query: ");
                            String query = sc.nextLine();
                            user.sendQuery(query);
                            break;
                            
                        case 6://logout
                            System.out.println("User logged out!!!");
                            break;
                            
                        default:
                            System.out.println("Invalid option. Try again!!!");
                    }
                    if (userOption == 6) break;
                }
            }
            
            //exit 
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again!!!");
            }
        }
        
        sc.close();
    }
}