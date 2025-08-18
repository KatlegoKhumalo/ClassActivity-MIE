/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie;

/**
 *
 * @author Studio20-09
 */
public class Movie {
    private String title;
    private String genre;
    private int year;
    private boolean available;

    public Movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.available = true; // default available
    }

    // Getters & Setters
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return title + " (" + year + ") - " + (available ? "Available" : "Rented");
    }

    public static void main(String[] args) {
        // Create movies
        Movie m1 = new Movie("Inception", "Sci-Fi", 2010);
        Movie m2 = new Movie("Titanic", "Romance", 1997);

        // Create customer
        Customer c1 = new Customer("William", "will@example.com", 101);

        // Create staff
        Stuff s1 = new Stuff("Alice", "alice@store.com", 201, "Manager", 2);

        // Rent a movie
        c1.rentMovie(m1);
        System.out.println(m1);

        // Return the movie
        c1.getRentals().get(0).returnMovie();
        System.out.println(m1);

        // Staff info
        System.out.println(s1);
    }
}




