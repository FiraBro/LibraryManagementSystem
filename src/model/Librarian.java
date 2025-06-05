package model;

public class Librarian {
    private String id;
    private String name;
    
    public Librarian(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void addBook(Book book, Library library) {
        if (book == null) {
            System.out.println("Cannot add null book");
            return;
        }
        if (library == null) {
            System.out.println("Library reference is null");
             System.out.println("Library reference is null");
              System.out.println("Library reference is null");
            return;
        }
        library.addBook(book);
        System.out.println("Book '" + book.getTitle() + "' added by librarian " + name);
    }
    
    public void removeBook(Book book, Library library) {
        if (book == null) {
            System.out.println("Cannot remove null book");
            return;
        }
        if (library == null) {
            System.out.println("Library reference is null");
            return;
        }
        library.removeBook(book);
        System.out.println("Book '" + book.getTitle() + "' removed by librarian " + name);
    }
    
    public void updateBookTitle(Book book, String newTitle) {
        if (book != null) {
            book.setTitle(newTitle);
            System.out.println("Book title updated to '" + newTitle + "' by " + name);
        } else {
            System.out.println("Cannot update title - book is null");
        }
    }
    // Getters and setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Librarian [id=" + id + ", name=" + name + "]";
    }
}