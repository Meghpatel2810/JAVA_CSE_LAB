import java.util.Scanner;

public class Practical_3_4 {
    public static void main(String[] args) {
        //CREATING OBJECT
        Date d=new Date();

        //CALLING METHODS
        d.set();
        d.get();
        //NAME
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}
class Date{ //CLASS
    int day,month,year;
    Scanner sc=new Scanner(System.in);

    void set() //INPUT METHOD
    {
        System.out.print("Enter the day :");
        day=sc.nextInt();
        System.out.print("Enter the month :");
        month=sc.nextInt();
        System.out.print("Enter the year :");
        year=sc.nextInt();

        if(day<0 || day >31 || month<0 || month>12 || year<0)
        System.exit(0);

        if(month==2 && day>29)
        System.exit(0);
    }
    void get() //OUTPUT METHOD
    {
        displayDate();
    }
    void displayDate() //DATE FORMAT METHOD
    {
        System.out.println("Date :"+day+"/"+month+"/"+year);
    }
}
