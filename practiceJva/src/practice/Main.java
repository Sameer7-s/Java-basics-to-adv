package practice;

import java.util.Scanner;

class Student {
    String name;
    int roll;
    char grade;

    // Method to input details
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        System.out.print("Enter Grade: ");
        grade = sc.next().charAt(0);
    }

    // Method to display details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();    // take input
        s.display();  // show output
    }
}