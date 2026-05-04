package Prog3;
class Rectangle {
    int length;
    int width;

    // Default Constructor
    Rectangle() {
        length = 0;
        width = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
        System.out.println("Parameterized Constructor Called");
    }
    // Method to calculate area
    int area() {
        return length * width;
    }
    // Method to display details
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}
public class constructor{
    public static void main(String[] args) {

        // Using Default Constructor
        Rectangle r1 = new Rectangle();
        r1.display();

        System.out.println();

        // Using Parameterized Constructor
        Rectangle r2 = new Rectangle(10, 5);
        r2.display();
    }
}