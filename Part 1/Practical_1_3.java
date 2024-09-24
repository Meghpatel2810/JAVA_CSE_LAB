public class Practical_1_3 {
    public static void main(String[] args)
    {
        double num=1234.5678;

        long x=(int) num;

        short y= (short) ( (num-x)*10000 );

        System.out.println("Value :" + x + "." + y);
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }    
}
