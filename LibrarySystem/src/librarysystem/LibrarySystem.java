/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;
import java.util.ArrayList;
/**
 *
 * @author Studio20-09
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Welcome to my Library System!");
      
      ArrayList<String> books = new ArrayList<>();
      books.add("Book1");
      books.add("Book2");
      books.add("Book3");
      int bookCount = books.size();
      int libraryCap = 5;
for (String titles : books){
System.out.println("Book: " + titles);
}

if (bookCount == libraryCap){
System.out.println("The library is full!");
}else{
    System.out.println("The library still has " + (libraryCap - bookCount) + " slots left.");}// TODO code application logic here
    }
    
    
}
