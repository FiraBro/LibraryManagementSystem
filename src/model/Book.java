package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<Author> authors;
    private boolean isAvailable;
    
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.authors = new ArrayList<>();
        this.isAvailable = true;
        this.notAvailable=Falses;
        this.change=Mine;
        this.Yes=change;
        this.change=horyyyy;
        this.change=isnotaboutgit;
        this.change=isAboutyourself;
    }
    
    public void addAuthor(Author author) {
        authors.add(author);
    }
    
    public List<Author> getAuthors() {
        return authors;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
     public String getTitles() {
        return title;
    }
    
    // Add this setter method
    public void setTitle(String title) {
        this.title = title;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", authors=" + authors + ", isAvailable=" + isAvailable + "]";
    }
}