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
        // ✅ New method for searching by ID or title
    public Book searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getId().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }
    // 🔍 Optional: Partial match search (by title or ID)
        public List<Book> searchBooksFuzzy(String keyword) {
            List<Book> results = new ArrayList<>();
            for (Book book : books) {
                if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getId().toLowerCase().contains(keyword.toLowerCase())) {
                    results.add(book);
                }
            }
            return results;
        }
    }
