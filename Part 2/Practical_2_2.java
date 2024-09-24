import java.util.Scanner;

public class Practical_2_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array :"); //INPUT
        int size=sc.nextInt();

        if(size<1) //CONDITION
        {
            System.out.println("Please enter correct size");
            System.exit(0);
        }

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter array element "+(i+1)+":");
            arr[i] =sc.nextInt();
        }
        
        System.out.println("The number of 9's in the array is "+array_count9(arr, size)); //OUTPUT WITH FUNCTION CALL
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
    public static int array_count9(int arr[],int size) //function
    {
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==9)
            count++;
        }
        return count;
    }
    
}
