import java.util.Scanner;
import model.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();
        
        // Create authors
        Author author1 = new Author("J.K. Rowling", "jk@example.com");
        Author author2 = new Author("George R.R. Martin", "grrm@example.com");
        
        // Create books
        Book book1 = new Book("123", "Harry Potter");
        book1.addAuthor(author1);
        
        Book book2 = new Book("456", "A Game of Thrones");
        book2.addAuthor(author2);
        
        // Create members
        Member member1 = new Member("M001", "Alice");
        Member member2 = new Member("M002", "Bob");
        
        // Create librarian
        Librarian librarian = new Librarian("L001", "Carol");
        
        // Librarian adds books to library
        librarian.addBook(book1, library);
        librarian.addBook(book2, library);
        
        // Borrow books
        Date dueDate = new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000); // 14 days from now
        member1.borrowBook(book1, dueDate);
        member2.borrowBook(book2, dueDate);
        
        // Try to borrow an already borrowed book
        member1.borrowBook(book1, dueDate);
        
        // Return books
        member1.returnBook(book1);
        
        // Librarian removes a book
        librarian.removeBook(book1, library);

        // -------------------------------
        // ✅ NEW: Search feature (console)
        // -------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Book Search ===");
        System.out.print("Enter book title or ID to search: ");
        String searchQuery = scanner.nextLine();

        Book foundBook = library.searchBook(searchQuery);

        if (foundBook != null) {
            System.out.println("✅ Book found: " + foundBook.getTitle() + " (ID: " + foundBook.getId() + ")");
        } else {
            System.out.println("❌ Book not found.");
        }

        scanner.close();
    }
}