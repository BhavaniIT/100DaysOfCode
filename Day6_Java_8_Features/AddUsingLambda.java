package Day6_Java_8_Features;

// Using lambda expressions

@FunctionalInterface
interface InterfAdd
{
    public void add(int a, int b);
}

public class AddUsingLambda
{
    public static void main(String[] args) 
    {
        InterfAdd i = (a,b)->System.out.println("The sum is:"+(a+b));
        //a,b datatypes are not mentioned
        //It will take add method in InterfAdd as method signature
        i.add(10,20);
    }
}
// Without lambda expressions
// interface InterfAdd
// {
//     public void add(int a, int b);
// }

// class AddDemo implements InterfAdd
// {
//     public void add(int a, int b)
//     {
//         System.out.println("The sum  is:"+(a+b));
//     }
// }
// public class AddUsingLambda 
// {
//     public static void main(String[] args) 
//     {
//         InterfAdd a = new AddDemo();
//         a.add(10,20);
//     }
    
// }
