package model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}