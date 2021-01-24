package Day4_Multithreading;

class ThreadPriority extends Thread
{
    //Priority from 1 to 10
    // 10 is maximum
    // 1 is minimum
    // 5 is normal
}

public class ThreadPriorityDemo 
{
    //Main thread priority default - 5
    // child thread priority depends on the parent thread
    public static void main(String[] args) 
    {
        ThreadPriority t = new ThreadPriority();
        System.out.println(Thread.currentThread().getPriority());
        t.start(); //Main thread starts t so main is parent thread
        System.out.println(t.getPriority()); //same as main thread - parent
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority()); //main thread - 7
        System.out.println(t.getPriority()); //priority won't depend on parent once it has started - 5
    }
    
    
}
