import java.util.Scanner;
public class Practical_3_5{
    public static void main(String[] args) 
    {
        //INPUTS
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        float length=sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle :");
        float breadth=sc.nextFloat();

        if(length<0 || breadth<0)
        System.exit(0);

        Area a=new Area(length, breadth); //OBJECT CREATION

        //OUTPUT
        System.out.println("The area of the rectangle is "+a.returnArea());
        sc.close();

        //NAME
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}
class Area{ //CLASS
    float area;

    public Area(float a , float b) //CONSTRUCTOR
    {
        area=a*b;
    }
    float returnArea() //OUTPUT METHOD
    {
        return area;
    }
}