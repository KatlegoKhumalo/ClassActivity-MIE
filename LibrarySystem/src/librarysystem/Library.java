/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;
   import java.util.ArrayList;
/**
 *
 * @author Studio20-09
 */
public class Library extends LibrarySystem {
     Library library = new Library();
void removeBookCode(){
    try {
        library.removeBook("Unknown Book");
    } catch (BookNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

public void removeBook(String title) throws BookNotFoundException {
    boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    if (!removed) {
        throw new BookNotFoundException("Book titled '" + title + "' not found.");
    } else {
        System.out.println("Removed: " + title);
    }
}


    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
    }
    
}


