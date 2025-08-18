/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author Studio20-09
 */
import java.util.Date;

public class Rental {
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Rental(Movie movie, Customer customer) {
        this.movie = movie;
        this.customer = customer;
        this.rentalDate = new Date();
        this.returnDate = null;
    }

    public void returnMovie() {
        this.returnDate = new Date();
        movie.setAvailable(true);
    }

    @Override
    public String toString() {
        return customer.getName() + " rented " + movie.getTitle() + " on " + rentalDate;
    }
}
