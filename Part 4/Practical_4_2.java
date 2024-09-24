import java.util.Scanner;

class Member { //BASE CLASS
    int age;
    double Salary;
    String name,address;
    long mobile;
    Scanner sc=new Scanner(System.in);

    void getdata(String position) //INPUT FUNCTION
    {
        System.out.print("Enter the name of the "+position+" :");
        name=sc.nextLine();
        System.out.print("Enter the age of the "+position+" :");
        age=sc.nextInt();
        System.out.print("Enter the phone number of the "+position+" :");
        mobile=sc.nextLong();
        System.out.print("Enter the address of the "+position+" :");
        sc.nextLine();
        address=sc.nextLine();
        System.out.print("Enter the salary of the "+position+" :");
        Salary=sc.nextDouble();
    }
    void putdata(String position) // OUTPUT FUNCTION
    {
        System.out.println("Position :"+position);
        System.out.println();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Phone number :"+mobile);
        System.out.println("Address :"+address);
        System.out.println("Salary :"+Salary);
    }
}

class Employee extends Member{ //DERIVED CLASS 1
    String Specialization;

    void get_Emploee()
    {
        getdata("employee"); //CALL TO BASE CLASS FUNCTION
        System.out.print("Enter the Specialization of the Employee :");
        sc.nextLine();
        Specialization=sc.nextLine();
    }
    void put_Employee()
    {
        putdata("Employee"); //CALL TO BASE CLASS FUNCTION
        System.out.println("Specialization :"+Specialization);
    }
}

class Manager extends Member{ //DERIVED CLASS 2
    String department;

    void get_Manager()
    {
        getdata("manager"); //CALL TO BASE CLASS FUNCTION
        System.out.print("Enter the department of the manager :");
        sc.nextLine();
        department=sc.nextLine();
    }
    void put_Manager()
    {
        putdata("Manager"); //CALL TO BASE CLASS FUNCTION
        System.out.println("Department :"+department);
    }
}
public class Practical_4_2 {
    public static void main(String[] args) {
        Employee e=new Employee(); //OBJECT CREATION
        Manager m=new Manager();

        //TERMINAL DATA
        e.get_Emploee();
        System.out.println();
        m.get_Manager();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        e.put_Employee();
        System.out.println();
        m.put_Manager();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}