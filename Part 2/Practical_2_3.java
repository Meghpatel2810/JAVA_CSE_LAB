import  java.util.Scanner ;
public class Practical_2_3 {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the size of the array:"); //INPUT
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
            arr[i]=sc.nextInt();
        }

        if(array_front9(arr)==true) //FUNCTION CALL
        System.out.println("One of the first four element in the array is 9");
        else
        System.out.println("One of the first four element in the array is not 9");

        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
    public static boolean array_front9(int arr[]) //FUNCTION
    {
        for(int i=0;i<4;i++)
        {
            if(arr[i]==9)
            return true;
        }
        return false;
    }
}
