package Day8_Java8_Cotd;
import java.util.function.Supplier;

public class GenerateOTP 
{
    public static void main(String[] args) 
    {
        Supplier s = () ->
        {
            String otp = "";
            for(int i=0; i<6; i++)
            {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println("OTP generated:"+s.get());
    }
}
