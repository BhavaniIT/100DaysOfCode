package Day4_Multithreading;

class CustomizeThread extends Thread
{

    public void run()  //Run method has the job of thread
    {
        System.out.println("Thread Started...");
    }

}

public class MyThread  
{

    public static void main(String[] args) 
    {
        CustomizeThread t = new CustomizeThread();  //Thread instansiation
        t.start();  //Starting thread
    }
    
}
