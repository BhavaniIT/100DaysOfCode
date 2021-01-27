package Day7;
import java.util.function.Predicate;
public class PredicateLambda 
{
    public static void main(String[] args) 
    {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));
        //we don't have to write functional interface for simple relational functions
        //So we can go for predicate to compare or check an integer
    }
}
