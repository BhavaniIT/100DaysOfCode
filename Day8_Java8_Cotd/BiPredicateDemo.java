package Day8_Java8_Cotd;
import java.util.function.BiPredicate;

public class BiPredicateDemo 
{
    public static void main(String[] args) 
    {
        //It accepts 2 paramteres. normal predicate accepts only one parameter
       BiPredicate<Integer,Integer> p = (a,b)->(a+b)%2==0;
       System.out.println(p.test(10,20)); 
    }
}



