import java.util.*;

class MyStack{
    private ArrayList<Object> list=new ArrayList<>();
    private int top;

    //METHODS
    public MyStack()
    {
        top=-1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public int getsize()
    {
        return list.size();
    }

    public Object peek()
    {
        if(isEmpty())
        return null;
        else
        return list.get(top);
    }
    
    public Object pop()
    {
        if(isEmpty())
        return null;
        else
        {
            Object temp=list.get(top);
            top--;
            return temp;
        }
    }

    public void push(Object obj)
    {
        list.add(obj);
        top++;
        return ;
    }

    public void Print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
        return ;
    }
}

public class Practical_8_1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        while(true)
        {
            System.out.println("[0]Exit");
            System.out.println("[1]Push");
            System.out.println("[2]Pop");
            System.out.println("[3]Peek");
            System.out.println("[4]Check if the stack is empty");
            System.out.println("[5]Get size of the stack");
            System.out.println("[6]Print the Stack");
            System.out.print("Enter your choice:");
           

            switch(sc.nextInt())
            {
                case 0: System.exit(0);

                case 1:
                {
                    stack.push(input());
                    break ;
                }
                case 2:
                {
                    System.out.println(stack.pop());
                    break ;
                }
                case 3:
                {
                    System.out.println(stack.peek());
                    break ;
                }
                case 4:
                {
                    System.out.println(stack.isEmpty() ? "Empty" : "Not Empty");
                    break ;
                }
                case 5:
                {
                    System.out.println("Size:"+stack.getsize());
                    break ;
                }
                case 6:
                {
                    System.out.println("--------------------------------------------------------");
                    stack.Print();
                    System.out.println("--------------------------------------------------------");
                    break ;
                }
                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println();
        }
    }
    public static Object input()
    {
        System.out.println("[1]Integer");
        System.out.println("[2]Double");
        System.out.println("[3]Boolean");
        System.out.println("[4]String");
        System.out.print("Enter your choice and the input:");
        switch(sc.nextInt())
        {
            case 1 :return sc.nextInt();
            case 2 :return sc.nextDouble();
            case 4 :return sc.next();
            case 3 :return sc.nextBoolean();
            default :return null;
        }
    }
}