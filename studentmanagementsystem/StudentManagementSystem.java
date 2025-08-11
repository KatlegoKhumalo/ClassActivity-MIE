/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Studio20-09
 */
public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add student
    public void addStudent() {
        System.out.print("\nEnter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = readInt();
        
        System.out.println("Enter grade: ");
        int grade = readInt();

        // Check if ID is unique
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(id)) {
                System.out.println("Error: Student ID already exists.");
                return;
            }
        }

        students.add(new Student(name, id, age, grade));
        System.out.println("Student added successfully.");
    }

    // Edit student
    public void editStudent() {
        System.out.print("\nEnter student ID to edit: ");
        String id = scanner.nextLine();
        Student student = findStudentByID(id);

        if (student == null) {
            System.out.println("tudent not found.");
            return;
        }

        System.out.print("Enter new name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) student.setName(name);

        System.out.print("Enter new age (0 to keep current): ");
        int age = readInt();
        if (age > 0) student.setAge(age);

        System.out.println("Student details updated.");
    }

    // Remove student
    public void removeStudent() {
        System.out.print("\nEnter student ID to remove: ");
        String id = scanner.nextLine();
        Student student = findStudentByID(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student removed successfully.");
    }
public void getGrade(){

}
    // Add grades to a student
    public void addGrades() {
        System.out.print("\nEnter student ID to add grades: ");
        String id = scanner.nextLine();
        Student student = findStudentByID(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        while (true) {
            System.out.print("Enter grade (0-100, -1 to stop): ");
            int grade = readInt();
            if (grade == -1) break;
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Must be 0-100.");
                continue;
            }
            student.addGrade(grade);
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students to display.");
            return;
        }
        for (Student s : students) {
            s.displayStudentInfo();
        }
    }

    // Calculate and display class average
    public void calculateClassAverage() {
        if (students.isEmpty()) {
            System.out.println("\nNo students in system.");
            return;
        }
        double total = 0;
        int count = 0;
        for (Student s : students) {
            total += s.calculateAverageGrade();
            count++;
        }
        System.out.printf("\nClass Average Grade: %.2f%n", total / count);
    }

    // Find student by ID
    private Student findStudentByID(String id) {
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(id)) return s;
        }
        return null;
    }

    // Safe integer input
    private int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number, try again: ");
            }
        }
    }

    // Menu
    public void start() {
        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Add Grades");
            System.out.println("5. Display All Students");
            System.out.println("6. Calculate Class Average");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = readInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> editStudent();
                case 3 -> removeStudent();
                case 4 -> addGrades();
                case 5 -> displayAllStudents();
                case 6 -> calculateClassAverage();
                case 7 -> {
                    System.out.println("Exiting program... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new StudentManagementSystem().start();
    }
}
