package Day4_Multithreading;

class NewThread extends Thread{

    public void run()
    {
        System.out.println("no-arg run");  
    }

    public void run(int i)  //Run overload
    {
        System.out.println("int-arg run");
    }

}

public class RunOverload {

    public static void main(String[] args) {
        NewThread t = new NewThread();
        
        t.start();   //No-arg run method by default
        t.run(10);  // It became like normal method so general call
        
    }
    
}
