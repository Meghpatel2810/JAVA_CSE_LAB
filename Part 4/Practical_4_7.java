import java.util.Scanner;

// Define an interface for shapes with methods for input and output
interface shapes {
    void input();   // Method for taking input
    void output();  // Method for displaying output
}

// A parent class that holds common properties for signs like area, text, and color
class signs {
    protected double area;  // Variable to store the area of the shape
    protected String text, color;  // Variables to store text and color of the shape
    Scanner sc = new Scanner(System.in);  // Scanner object for input

    // Method to take input for the sign's text and color
    void input_sign(String shape) {
        System.out.print("Enter the text of the " + shape + " :");
        text = sc.nextLine();
        System.out.print("Enter the color of the " + shape + " :");
        color = sc.nextLine();
    }

    // Method to display the sign's text and color
    void output_sign(String shape) {
        System.out.println("Text of the " + shape + " :" + text);
        System.out.println("Color of the " + shape + " :" + color);
    }
}

// A class representing a circle that extends the 'signs' class and implements the 'shapes' interface
class circle extends signs implements shapes {
    private double radius;  // Variable to store the radius of the circle
    Scanner sc = new Scanner(System.in);  // Scanner object for input

    // Method to take input for the circle's radius, text, and color
    @Override
    public void input() {
        input_sign("circle");
        System.out.print("Enter the radius of the circle :");
        radius = sc.nextDouble();

        // Calculate the area of the circle
        area = radius * radius * 3.14;
    }

    // Method to display the circle's text, color, and area
    @Override
    public void output() {
        System.out.println();
        output_sign("circle");
        System.out.println("Area of the circle :" + area);
    }
}

// A class representing a rectangle that extends the 'signs' class and implements the 'shapes' interface
class Rectangle extends signs implements shapes {
    private double length, breadth;  // Variables to store length and breadth of the rectangle
    Scanner sc = new Scanner(System.in);  // Scanner object for input

    // Method to take input for the rectangle's dimensions, text, and color
    @Override
    public void input() {
        input_sign("rectangle");
        System.out.print("Enter the length of the rectangle :");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle :");
        breadth = sc.nextDouble();

        // Calculate the area of the rectangle
        area = length * breadth;
    }

    // Method to display the rectangle's text, color, and area
    @Override
    public void output() {
        System.out.println();
        output_sign("rectangle");
        System.out.println("Area of the rectangle :" + area);
    }
}

// Main class to run the program
public class Practical_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input
        circle c = new circle();  // Create a circle object
        Rectangle r = new Rectangle();  // Create a rectangle object

        // Display menu options to the user
        System.out.println("[1] Circle");
        System.out.println("[2] Rectangle");
        System.out.print("Enter your choice :");
        int choice = sc.nextInt();  // Take user's choice as input

        // Switch case to handle the user's choice
        switch (choice) {
            case 1: {
                c.input();  // Call input method for circle
                c.output();  // Call output method for circle
                break;
            }
            case 2: {
                r.input();  // Call input method for rectangle
                r.output();  // Call output method for rectangle
                break;
            }
            default: {
                System.out.println("Invalid choice");  // Handle invalid input
            }
        }

        sc.close();  // Close the Scanner object
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");  // Final output
    }
}