package Day7;

interface I
{
    //It won't affect the implementation of other classes
    //But we can add new features
    default void m1()
    {
        System.out.println("I default method");
    }
}

public class DefaultMethod implements I
{
    public static void main(String[] args) 
    {
        I i = new DefaultMethod();
        i.m1();  
    }
    
}
