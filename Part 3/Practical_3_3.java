import java.util.Scanner;
class Employee{ //CLASS
    String first_name,last_name;
    double salary;

    public void get() //INPUT METHOD
    {
        System.out.println("Name :"+first_name+" "+last_name);
        System.out.println("Salary :"+salary);
    }
    public void set() //OUTPUT METHOD
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("First name :");
        first_name=sc.nextLine();
        System.out.print("Last name :");
        last_name=sc.nextLine();
        System.out.print("Salary :");
        salary=sc.nextDouble();
        sc.close();
        
        if(salary<0)
        salary=0.0;
    }
    void raise(double num) //RAISING THE SALARY METHOD
    {
        salary+=(num*salary)/100;
    }
    
}

public class Practical_3_3 {
    public static void main(String[] args) 
    {
        //CREATING OBJECTS
        Employee e1=new Employee();
        Employee e2=new Employee();

        //INPUT DATA
        System.out.println("Enter data of employee number 1 ");
        e1.set();
        System.out.println("Enter data of employee number 2 ");
        e2.set();

        System.out.println();
        System.out.println("Salary :-");
        //OuTPUT1
        e1.get();
        e2.get();

        e1.raise(10); //RAISING THE SALARY
        e2.raise(10);

        //OUTPUT2
        System.out.println();
        System.out.println("The salary of two employees after 10% hike ");
        System.out.println();
        e1.get();
        e2.get();

        //name
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}