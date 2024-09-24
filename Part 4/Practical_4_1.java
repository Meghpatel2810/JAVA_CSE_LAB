public class Practical_4_1 {
    public static void main(String[] args) {
        //CREATES OBJECT
        Parent p=new Parent();
        child c=new child();
        p.intro_parent(); // CALLS METHOD OF PARENT CLASS
        c.intro_child();// CALLS METHOD OF CHILD CLASS
        c.intro_parent(); // CALLS METHOD OF PARENT CLASS
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");

    }
}
class Parent{ //BASE CLASS
    public void intro_parent()
    {
        System.out.println("This is Parent class");
    }
}
class child extends Parent{ //DERIVED CLASS
    public void intro_child()
    {
        System.out.println("This is child class");
    }
}