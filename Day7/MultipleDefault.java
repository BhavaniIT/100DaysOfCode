package Day7;

interface Left
{
    default void m1()
    {
        System.out.println("Left interface");
    }
}

interface Right
{
    default void m1()
    {
        System.out.println("Right interface");
    }
}

public class MultipleDefault implements Left,Right
{
    public void m1()
    {   Left.super.m1(); //Left interface
        Right.super.m1(); //Right interface
        System.out.println("Own Default method");
        Right.super.m1(); 
    }
    public static void main(String[] args) 
    {
        //Left.super.m1(); => output:Left
        //Right.super.m1(); => output: Right
        Left l = new MultipleDefault();
        l.m1(); //overridden
        Right r = new MultipleDefault();
        r.m1(); //overridden
        MultipleDefault m = new MultipleDefault();
        m.m1(); //overridden
    }
}
