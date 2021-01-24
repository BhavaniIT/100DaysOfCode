package Day4_Multithreading;

class CustomizedThread extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Child Thread");
            Thread.yield(); //Checks for another thread with the same priority
        }
    }
}

public class YieldThread {
    public static void main(String[] args) 
    {
        CustomizedThread t = new CustomizedThread();
        t.start();
        for(int i=0; i<5; i++)
        {
            System.out.println("Main thread");
            // Main thread completes first
            //because customise thread is yielding everytime
        }
    }
    
}
