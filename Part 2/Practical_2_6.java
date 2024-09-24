import java.util.Scanner;
import java.util.Arrays;

public class Practical_2_6 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string :");//INPUT
        String str=sc.nextLine();

        System.out.println();
        //OUTPUT
        System.out.println("Length of the string :"+str.length());
        System.out.println("Lowercase of the string :"+str.toLowerCase());
        System.out.println("Uppercase of the string :"+str.toUpperCase());
        System.out.println("Reverse of the string :"+Reverse(str));

        char arr[]=str.toCharArray();
        Arrays.sort(arr); //SORT FUNCTION

        System.out.println("Sorted string: "+new String(arr));
        
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }

    public static String Reverse(String str) //USER DEFINED REVERSE FUNCTION 
    {
        int length=str.length();

        char arr[]=new char[length];
        arr=str.toCharArray();
        char rev[]=new char[length];
        
        int i=0,j=length-1;

        while(j>=0)
        {
            rev[i]=arr[j];
            i++;
            j--;
        }
        return new String(rev);
    }
}