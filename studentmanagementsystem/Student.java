package studentmanagementsystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// ===================== Student Class =====================
class Student {
    private String name;
    private String studentID;
    private int age;
    private double grade;
    private ArrayList<Integer> grades;

    public Student(String name, String studentID, int age, int grade) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.grades = new ArrayList<>();
        this.grade = grade;
    }

    // Getters & Setters (Encapsulation)
    public String getName()
    { return name; }
    public void setName(String name) 
    { this.name = name; }

    public String getStudentID() 
    { return studentID; }
    
    public void setStudentID(String studentID) 
    { this.studentID = studentID; }

    public int getAge() 
    { return age; }
    
    public void setAge(int age) 
    { this.age = age; }

    public ArrayList<Integer> getGrades() 
    { return grades; }

    // Add a grade
    public void addGrade(int grade) {
        this.grade = grade;
        grades.add(grade);
    }
     public int getGrade(int grade) {
        this.grade = grade;
        return grade;
    }

    // Calculate average grade
    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int g : grades) sum += g;
        return sum / grades.size();
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("\nName: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        //System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f%n", calculateAverageGrade());
    }
}

