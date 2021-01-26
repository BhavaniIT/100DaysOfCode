package Day6;

public class VarArg2D {
    public static void main(String... args)  //It works var-arg string
    {
        int[] a = {10,20,30};
        int[] b = {40,50,60};
        print(a,b);
    }

    public static void print(int[]... x)
    {
        for(int[] x1 : x)
        {
            System.out.println(x1[0]);
        }
    }
    
}
