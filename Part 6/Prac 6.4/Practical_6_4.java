import java.io.*;  

public class Practical_6_4 {
    public static void main(String[] args) throws Exception {
        // Create a FileInputStream object to read data from "file_read_64.txt"
        FileInputStream fin = new FileInputStream("file_read_64.txt");  
        
        // Create a FileOutputStream object to write data to "file_write_64.txt"
        FileOutputStream fout = new FileOutputStream("file_write_64.txt");  
        
        int x;  // Variable to hold each byte of data read from the file
        
        // Read data from the input file and write it to the output file, byte by byte
        while ((x = fin.read()) != -1) {
            fout.write(x);  // Write the byte to the output file
        }
        
        // Print a message indicating that the data has been copied successfully
        System.out.println("Data Copied Successfully");  
        
        // Close the FileInputStream and FileOutputStream to release resources
        fin.close();  
        fout.close();  
        // Print final output indicating the end of the program
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}