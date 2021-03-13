package Day14_LCO;
import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String res = "";
        char[] c = input.toCharArray();
        //Method-1
       for(int i=c.length-1; i>=0; i--)
            res += c[i];

        System.out.println("Reverse Method-1:"+res);

        //Method-2
        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reverse Method-2:"+sb.reverse());

    }
}