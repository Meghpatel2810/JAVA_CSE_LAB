import java.util.Scanner; 
public class Practical_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        // Initialize variables x and y with default values of 0
        int x = 0, y = 0;  
        
        // Prompt the user to enter the value of x
        System.out.print("Enter the value of x :");  
        
        try {   //try catch block
            x = sc.nextInt();  
        } catch (Exception e) {
            System.out.println("Invalid value of variable x");
            e.printStackTrace();  
            System.exit(0);  // Exit the program
        }
        
        // Prompt the user to enter the value of y
        System.out.print("Enter the value of y :");  
        
        try {   //try catch block
            y = sc.nextInt();  
            
            // Check if y is 0, which would cause a division by zero error
            if (y == 0) {
                sc.close();  
                throw new ArithmeticException("/ by zero");  // Manually throw an exception
            }
        } catch (Exception e) {
            
            System.out.println("Invalid value of variable y");  
            e.printStackTrace();
            System.exit(0);  // Exit the program
        }   
        
        // If no exceptions occurred, print the result of x divided by y
        System.out.println("x/y=" + (x / y));  
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
        sc.close();
    }
}