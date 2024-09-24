// first interface P1
interface P1 {
    // Constant string for P1
    final String const1 = "This is P1 interface";

    // Abstract method
    void display1();
}

// second interface P2
interface P2 {
    // Constant string for P2
    final String const2 = "This is P2 interface";

    // Abstract method
    void display2();
}

// interface P12 that extends both P1 and P2
interface P12 extends P1, P2 {
    // Constant string for P12
    final String const12 = "This is P12 interface";

    // Abstract method
    void display12();
}

// Class Q implements the P12 interface
class Q implements P12 {

    // Implementing methods from the interfaces
    @Override
    public void display1() {
        System.out.println(const1);
    }

    @Override
    public void display2() {
        System.out.println(const2);
    }

    @Override
    public void display12() {
        System.out.println(const12);
    }
}

public class Practical_4_6 {
    public static void main(String[] args) {
        // Create an instance of Q
        Q obj = new Q();
        
        // Call methods to display constants
        obj.display1(); 
        obj.display2(); 
        obj.display12(); 
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}