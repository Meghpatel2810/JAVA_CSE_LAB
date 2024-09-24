public class Practical_3_2 {
    public static void main(String[] args)
    {   //object formation 
        TriangleArea ta1= new TriangleArea();
        TriangleArea ta2= new TriangleArea(4.687699040360167);
        TriangleArea ta3=new TriangleArea(5,255);

        System.out.println("Area :"+ta1.area);
        System.out.println("Area :"+ta2.area);
        System.out.println("Area :"+ta3.area);
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}

class TriangleArea{ //class

    double area;

    //CONSTRUCTORS
    TriangleArea() {  area=0;  }
    TriangleArea(double r) {  area=3.14*r*r;  }
    TriangleArea(double b,double h) {  area=(h*b)/2;  }
}