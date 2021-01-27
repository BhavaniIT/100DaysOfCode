package Day7;

interface StaticDemo
{
    public static void demo()
    {
        System.out.println("Interface Static Method");
    }
}

class StaticCall
{
    public void print()
    {
        System.out.println("Non-implementation class of interface:");
        StaticDemo.demo();  //Non-implementation class can also print
    }
}

public class InterfaceStatic implements StaticDemo
{
    public static void main(String[] args) 
    {
        
        //Only possible ways to call interface static method
        StaticCall sc = new StaticCall();
        sc.print();
        StaticDemo.demo();  //One and only way to call interface-static method

        //Unlike default method interface static is not visible to implementation class

        //All of these won't work
        // InterfaceStatic s = new InterfaceStatic();
        // s.demo();
        // StaticDemo s1 = new InterfaceStatic();
        // s1.demo();
        // InterfaceStatic.demo();
        // demo();
    }
}