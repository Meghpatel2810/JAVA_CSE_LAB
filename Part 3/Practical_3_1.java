import java.util.Scanner;

public class Practical_3_1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the amount in pounds :"); //INPUT
        double num=sc.nextDouble();
        System.out.println("The amount in rupees :"+ num*100);//OUTPUT
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}