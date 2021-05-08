package Day8_Java8_Cotd;
import java.util.Date;
import java.util.function.Supplier;


public class DateBySupplier 
{
    public static void main(String[] args) 
    {
        Supplier<Date> s = ()-> new Date();
        System.out.println(s.get());
    }
}


