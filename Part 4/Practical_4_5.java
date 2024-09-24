class Degree{ //BASE CLASS
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{ //DERIVED CLASS 1
    public void Degree()
    {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree{ //DERIVED CLASS 2
    public void Degree()
    {
        System.out.println("I am a Postgraduate");
    }
}

public class Practical_4_5 {
    public static void main(String[] args) {
        //CREATING OBJECTS
        Undergraduate ug=new Undergraduate();
        Postgraduate pg=new Postgraduate();

        ug.getDegree(); //BASE CLASS METHOD
        ug.Degree(); 
        pg.getDegree(); //BASE CLASS METHOD
        pg.Degree();
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }
}