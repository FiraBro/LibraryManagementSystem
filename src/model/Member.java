package model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private List<Loan> loans;
    
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<>();
    }
    
    public void borrowBook(Book book, Date dueDate) {
        if (book.isAvailable()) {
            Loan loan = new Loan(book, this, new Date(), dueDate);
            loans.add(loan);
            System.out.println("Book " + book.getTitle() + " borrowed by " + name);
        } else {
            System.out.println("Book " + book.getTitle() + " is not available");
        }
    }
    
    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getReturnDate() == null) {
                loan.returnBook();
                System.out.println("Book " + book.getTitle() + " returned by " + name);
                return;
            }
        }
        System.out.println("No active loan found for book " + book.getTitle());
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Loan> getLoans() {
        return loans;
    }
    
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }
}