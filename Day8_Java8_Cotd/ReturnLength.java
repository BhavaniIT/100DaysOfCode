package Day8_Java8_Cotd;
import java.util.function.Function;
public class ReturnLength 
{
    public static void main(String[] args) 
    {
        Function<String, Integer> f = s->s.length();
        String[] s = {"Bhavani","is","Learning","java","version8"};
        System.out.println("Length of the strings:");
        for(String s1:s)
        {
            System.out.println(s1+":"+f.apply(s1));
        }

    }
}
