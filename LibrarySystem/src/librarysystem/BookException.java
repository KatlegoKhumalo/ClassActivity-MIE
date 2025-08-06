/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package librarysystem;

/**
 *
 * @author Studio20-09
 */
public class BookException extends Exception {

    public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

}
