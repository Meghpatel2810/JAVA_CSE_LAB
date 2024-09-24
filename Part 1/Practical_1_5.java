import java.util.Scanner;

public class Practical_1_5 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int RS;
        int code[]={1,2,3,4,5};
        float tax[]={8,12,5,7.5f,3};
        String product[]={ "Motor","Fan","Tube","Wires","Others" };
        int price[]={100,200,300,400,500};
        
        for(int i=0;i<5;i++)
        {
            System.out.println(code[i] + " for " + product[i] );
        }

        
        System.out.print("Enter your choice :");
        int choice = sc.nextInt();
        

        switch(choice)
        {
            case 1:
            {
                RS = (int)(price[choice-1] + (price[choice-1]*tax[choice-1])/100);
                System.out.print("Price :");
                System.out.println(RS);
                break;
            }
            case 2:
            {
                RS = (int)(price[choice-1] + (price[choice-1]*tax[choice-1])/100);
                System.out.print("Price :");
                System.out.println(RS);
                break;
            }
            case 3:
            {
                RS = (int)(price[choice-1] + (price[choice-1]*tax[choice-1])/100);
                System.out.print("Price :");
                System.out.println(RS);
                break;
            }
            case 4:
            {
                RS = (int)(price[choice-1] + (price[choice-1]*tax[choice-1])/100);
                System.out.print("Price :");
                System.out.println(RS);
                break;
            }
            case 5:
            {
                RS = (int)(price[choice-1] + (price[choice-1]*tax[choice-1])/100);
                System.out.print("Price :");
                System.out.println(RS);
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }
        }
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
        sc.close();
    }
}