import java.util.Scanner;
public class Practical_3_6 {
    public static void main(String[] args) {

        //object creation
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex result=new Complex();

        //inputs
        System.out.println("Complex number 1");
        c1.getdata();
        System.out.println("Complex number 2");
        c2.getdata();

        System.out.println();

        //Operations and results
        result=c1.sum(c2);
        System.out.print("Addition :");
        result.putdata();
        result=c1.diffrence(c2);
        System.out.print("Substraction:");
        result.putdata();
        result=c1.product(c2);
        System.out.print("Multiplication:");
        result.putdata();
        
        //name
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}

class Complex{
    float real;
    float imaginary;

    Scanner sc=new Scanner(System.in);

    //display functions
    public void getdata()
    {
        System.out.print("Enter the real part :");
        real=sc.nextFloat();
        System.out.print("Enter the imaginary part :");
        imaginary=sc.nextFloat();
    }
    public void putdata()
    {
        if(imaginary>0)
        System.out.println(real + "+ i("+imaginary+")");
        else
        {
            imaginary= (-1)*imaginary;
            System.out.println(real + "- i("+imaginary+")");
        }
    }

    //ARITHMETIC FUNCTIONS
    Complex sum(Complex c)
    {
        Complex temp=new Complex();
        temp.real=real+c.real;
        temp.imaginary=imaginary+c.imaginary;

        return temp;
    }
    Complex diffrence(Complex c)
    {
        Complex temp=new Complex();
        temp.real=real-c.real;
        temp.imaginary=imaginary-c.imaginary;

        return temp;
    }
    Complex product(Complex c)
    {
        Complex temp=new Complex();

        temp.real=(real*c.real) - (imaginary*c.imaginary);
        temp.imaginary = (real*c.imaginary) + (c.real*imaginary);
        
        return temp;
    }    
}