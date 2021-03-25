package Day15_Recursion;

public class RecursionSample1 {

    public static void recursion(int n)
    {
        if(n>0)
        {
            recursion(n-1);
            System.out.println(n+" ");
            recursion(n-1);
        }
        
    }
    public static void main(String[] args) {
        int n = 3;
        recursion(n);
    }
}
