package Day7;

//Anonymous and Lambda are independent concepts
//Anonymous class - 1.7v
//Lambda expression - 1.8v
interface Demo
{
    public void m1();
    public void m2();
}
public class AnonymousInner 
{
    public static void main(String[] args) 
    {
        Runnable r = ()->{System.out.println("Printing from Lambda");}; //Lambda expression
        Thread t = new Thread(r);
        t.start();
        System.out.println("Printing from Main method");
        Thread t1 = new Thread() //creating child class of thread - Anonymous class
        {
            public void run()
            {
                System.out.println("Thread from Anonymous");
            }
        };
        t1.start();
        Demo d = new Demo()  //Anonymous class
        {
            public void m1(){System.out.println("M1 method of non-functional Interface");}
            //Anonymous class can implement all the class and interfaces
            //functional interface and non functional interface
            public void m2(){System.out.println("M2 method of non-functional Interface");}
            //Lambda expression can only use Functional Interface
            //So, Anonymous class is more powerful than lambda expressions
        };

        d.m1();
        d.m2();
        
    }
}
