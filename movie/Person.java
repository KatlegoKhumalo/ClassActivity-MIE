/*
 * Base class for common person details.
 */
package movie;

public class Person {
    private String name;
    private String email;
    private int par;
    public Person(String name, String email, int par) {
        this.name = name;
        this.email = email;
        this.par = par;
    }

    // Getters
    public String getName() { 
        return name; 
    }
    public String getEmail() { 
        return email; 
    }
    public int getPar(){
    return par;
    }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }

    /*void introduce() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
