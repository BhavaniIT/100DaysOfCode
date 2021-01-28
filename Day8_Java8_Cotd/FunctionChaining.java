package Day8_Java8_Cotd;
import java.util.function.Function;
public class FunctionChaining 
{
    public static void main(String[] args) 
    {
        Function<Integer,Integer> f1 = i-> 2*i;
        Function<Integer,Integer> f2 = i->i*i;

        System.out.println("andThen() first f1 and f2:"+f1.andThen(f2).apply(3));
        System.out.println("compose() first f2 and f1:"+f1.compose(f2).apply(3));

    }
}
