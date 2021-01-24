package Day4_Multithreading;

class RunThread implements Runnable
{
    public void run()
    {
        System.out.println("Runnable Interface implemented");
    }
}

public class RunnableDemo extends Thread
{
    public static void main(String[] args) {
        RunThread r = new RunThread();  //can't use Runnable type reference because
        Thread t = new Thread(r); //start method is in Thread class
        t.start();
    }
}
