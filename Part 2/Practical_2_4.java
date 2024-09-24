import java.util.Scanner;
public class Practical_2_4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string :"); //INPUT
        String str=sc.nextLine();

        System.out.println("Answer :"+double_char(str)); //FUNCTION CALL AS OUTPUT
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");

    }
    public static String double_char(String str) //FUNCTION
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            result=result+str.charAt(i)+str.charAt(i);
        }
        return result;
    }
}