class Rectangle{ //BASE CLASS
    int length;
    int breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }

    void Print_area()
    {
        System.out.println("Area :"+length*breadth);
    }
    void Print_perimeter()
    {
        System.out.println("Perimeter :"+2*(length+breadth));
    }
}

class Square extends Rectangle{ //DERIVED CLASS
    int side;

    Square(int side)
    {
        super(side,side); //SUPER TO CALL CONSTRUCTOR OF BASE CLASS
    }
}

public class Practical_4_3 {
    public static void main(String[] args) {
        
        Rectangle r=new Rectangle(5, 10);
        Square s=new Square(69);

        //NORMAL CREATION OF OBJECT
        System.out.println("For Rectangle :-");
        r.Print_area();
        r.Print_perimeter();

        System.out.println("For Square :-");
        s.Print_area();
        s.Print_perimeter();

        System.out.println("****************************************************************************************");
        //CREATION OF OBJECT USING ARRAY OF OBJECTS
        Square sq[]=new Square[2];
        Rectangle re[]=new Rectangle[2];
        int k=83;

        for(int i=0;i<2;i++,k++)
        {
            sq[i]=new Square(k);
            re[i]=new Rectangle(k,69);
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("For Rectangle :-");
            re[i].Print_area();
            re[i].Print_perimeter();

            System.out.println("For Square :-");
            sq[i].Print_area();
            sq[i].Print_perimeter();
        }
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}