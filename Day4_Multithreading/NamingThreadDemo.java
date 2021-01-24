package Day4_Multithreading;

class NameThread extends Thread
{
    //Default name Thread-0
    //If next thread created then Thread - 1 and so on..
    public void run()
    {
        System.out.println("In run block:"+Thread.currentThread().getName());
    }

}

public class NamingThreadDemo {

    public static void main(String[] args) 
    {
        NameThread t = new NameThread();
        t.setName("Created Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Newly created thread name:"+ t.getName());
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
    
}
