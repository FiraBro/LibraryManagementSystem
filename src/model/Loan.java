package model;

import java.util.Date;

public class Loan {
    private Book book;
    private Member member;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;
    
    public Loan(Book book, Member member, Date issueDate, Date dueDate) {
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.book.setAvailable(false);
    
    }
    public void returnBook() {
        this.returnDate = new Date();
        this.book.setAvailable(true);
    }
    
    public boolean isOverdue() {
        if (returnDate != null) {
            return returnDate.after(dueDate);
        }
        return new Date().after(dueDate);
    }
    
    // Getters
    public Book getBook() {
        return book;
    }
    
    public Member getMember() {
        return member;
    }
    
    public Date getIssueDate() {
        return issueDate;
    }
    
    public Date getDueDate() {
        return dueDate;
    }
    
    public Date getReturnDate() {
        return returnDate;
    }
    
    @Override
    public String toString() {
        return "Loan [book=" + book.getTitle() + ", member=" + member.getName() + 
               ", issueDate=" + issueDate + ", dueDate=" + dueDate + 
               ", returnDate=" + returnDate + "]";
    }
}