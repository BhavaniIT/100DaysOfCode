package Day6_Java_8_Features;

interface SquareInterf
{
    public int square(int a);
}

public class LambdaSquare 
{
    public static void main(String[] args) 
    {
        SquareInterf i = a -> a*a;
        System.out.println("Square value:"+i.square(10)); 
    }
    
}
