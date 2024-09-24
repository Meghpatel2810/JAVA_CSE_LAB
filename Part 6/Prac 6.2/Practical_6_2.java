import java.io.*; 

public class Practical_6_2 {
    public static void main(String[] args) throws Exception {
        // Create a FileReader object to read the contents of the file "xanadu.txt"
        FileReader fr = new FileReader("xanadu.txt");  
        
        int count = 0, i; 
        
        // Read the file character by character
        while ((i = fr.read()) != -1) {
            // Check if the character matches the first character of the command-line argument
            if ((char) i == args[0].charAt(0))  
                count++;  // Increment the counter if there's a match
        }
        
        // Print the total count of occurrences
        System.out.println(count);  
        
        // Close the FileReader to release system resources
        fr.close();  
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}