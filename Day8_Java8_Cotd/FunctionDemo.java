package Day8_Java8_Cotd;
import java.util.function.Function;

public class FunctionDemo 
{
    public static void main(String[] args) 
    {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(10));
        //First parameter --> Input type
        //Second paramter --> Return type
    }
}
