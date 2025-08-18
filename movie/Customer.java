/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author Studio20-09
 */
import java.util.*;

public class Customer extends Person {
    private int customerID;
    private List<Rental> rentals;

    public Customer(String name, String email, int customerID) {
        super(name, email, 24);
        this.customerID = customerID;
        this.rentals = new ArrayList<>();
    }

    public int getCustomerID() { return customerID; }
    public List<Rental> getRentals() { return rentals; }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    @Override
    public String toString() {
        return "Customer: " + getName() + " (ID: " + customerID + ")";
    }
    public void rentMovie(Movie movie) {
    if (movie.isAvailable()) {
        Rental rental = new Rental(movie, this);
        rentals.add(rental);
        movie.setAvailable(false);
        System.out.println(getName() + " rented " + movie.getTitle());
    } else {
        System.out.println(movie.getTitle() + " is not available.");
    }
}

}

