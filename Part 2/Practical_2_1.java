import java.util.Scanner;
public class Practical_2_1 {
    public static void main( String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string:"); //INPUT
        String str=sc.nextLine();

        System.out.print("Enter the number of times you want to repeat :");
        int n=sc.nextInt();

        System.out.println("Answer :"+front_times(str, n)); //CALL OF FUNCTION AS OUTPUT
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }

    public static String front_times(String str,int n) // FUNCTION 
    {
        String result="";
        for(int i=0;i<n;i++)
        {
            if(str.length()<3)
            result+=str;
            else
            result+=str.substring(0, 3);
            
        }
        return result;
    }
}