package Day6_Java_8_Features;


//Using Lambda expression

@FunctionalInterface //Annotation to check it's Functional Interface
interface Interf
{
    public void m1();
}

public class FirstLambdaDemo
{
    public static void main(String[] args) 
    {
        Interf i = ()-> System.out.println("Hello by Lambda expression"); //Assign value to lambda expression
        //If you want to invoke Functional interface should be used
        i.m1();
    }
}





//Traitional way of Doing that
// interface Interf
// {
//     public void m1();
// }

// class Demo implements Interf
// {
//     public void m1()
//     {
//         System.out.println("Hello");
//     }
// }
// public class FirstLambdaDemo {
    
//     public static void main(String[] args) 
//     {
//         Interf i = new Demo();
//         i.m1();
//     }
    
// }
