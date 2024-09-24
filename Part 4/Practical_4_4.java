class A{ //Parent class
    protected  static int x=10;
}

class B extends  A{ //CHILD CLASS
    private int x=20;

    public void display()
    {
        System.out.println("x in A :"+A.x); //ACCESING x OF CLASS A 
        System.out.println("x in B :"+this.x);//ACCESING x OF CLASS B
    }
}

public class Practical_4_4 {
    public static void main(String[] args) {
        B b=new B(); //CREATING OBJECT
        b.display(); 
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}