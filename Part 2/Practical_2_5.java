import java.util.Scanner;

public class Practical_2_5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :"); //TAKE INPUT
        String str = sc.nextLine();

        String arr[]=str.split(" "); //SPLIT 

        System.out.print("Reversed string : ");
        //MAIN LOGIC 
        for(int i=0;i<arr.length;i++)
        {
            String result="";
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                result=result+arr[i].charAt(j);
            }
            System.out.print(result+" ");
        }
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}