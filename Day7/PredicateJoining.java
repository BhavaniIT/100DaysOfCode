package Day7;
import java.util.function.Predicate;

public class PredicateJoining 
{
    public static void main(String[] args) 
    {
        int[] x = {0,5,40,12,61,89,43};
        Predicate<Integer> p1 = e-> e%2 == 0;
        Predicate<Integer> p2 = e-> e>10;
        System.out.println("Even and greater than 10:");
        for(Integer i: x)
        {
            if(p1.and(p2).test(i))
            System.out.println(i);
        } 
        System.out.println("Even or greater than 10:");
        for(Integer i: x)
        {
            if(p1.or(p2).test(i))
            System.out.println(i);
        } 
        System.out.println("Opposite of even");
        for(Integer i: x)
        {
            if(p1.negate().test(i))
            System.out.println(i);
        }


        
    }
    
}
