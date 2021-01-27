package Day7;
import java.util.function.Predicate;
public class CheckStringLength 
{
    public static void main(String[] args) 
    {
        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("Bhavani"));
        System.out.println(p.test("Java"));

        //Another example

        String[] b= {"Bhavani", "java", "version8", "learning","okay"};
        for(String b1:b)
        {
            Predicate<String> p1 = str -> str.length() > 5;
            if(p1.test(b1))
            {
                System.out.println("Length greater than 5:"+b1);
            }
            
        }

    }
    
}
