/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author Studio20-09
 */
public class Stuff extends Person {
    private int staffID;
    private String role;

    public Stuff(String name, String email, int staffID, String role, int par) {
        super(name, email, par);
        this.staffID = staffID;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff: " + getName() + " (" + role + ")";
    }
}

