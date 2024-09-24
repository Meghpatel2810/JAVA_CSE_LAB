import java.io.*;  // Import necessary classes for file handling

public class Practical_6_5 {
    public static void main(String[] args) {
        try {
            // Call the method to write data to the file
            Write_in_the_file();  
            System.out.println("Successfully written in the file");
            
            // Call the method to read data from the file
            Read_from_the_file();  
            System.out.println("Successfully read from the file");
        } 
        catch (Exception e) {
            // Catch any exception and print an error message
            System.out.println("Error");  
            e.printStackTrace();  // Print stack trace for debugging
        }
        
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");  // Final output
        return;
    }

    // Method to write data to the file "file65.txt"
    public static void Write_in_the_file() throws Exception {
        // Create a FileWriter and BufferedWriter to write data into the file
        FileWriter file = new FileWriter("file65.txt");  
        BufferedWriter br = new BufferedWriter(file);
        
        // Write content into the file
        br.write("My name is Megh Patel \nI am Pursuing B-tech at Charotar University of Science and Technology \nComputer Science and Engineering");
        
        // Close the BufferedWriter and FileWriter to release resources
        br.close();  
        file.close();  
        return;
    }

    // Method to read data from the file "file65.txt"
    public static void Read_from_the_file() throws Exception {
        // Create a FileReader and BufferedReader to read data from the file
        FileReader file = new FileReader("file65.txt");  
        BufferedReader br = new BufferedReader(file);
        
        String str;  // Variable to hold each line of the file

        // Print the header before displaying file contents
        System.out.println("File contents:-");
        System.out.println("---------------------------------------");
        
        // Read the file line by line and print each line
        while ((str = br.readLine()) != null) {
            System.out.println(str);  // Print the current line
        }
        
        // Print footer after the file contents
        System.out.println("---------------------------------------");
        
        // Close the BufferedReader and FileReader to release resources
        br.close();  
        file.close();  
        return;
    }
}