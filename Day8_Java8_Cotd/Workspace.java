package Day8_Java8_Cotd;
import java.util.Scanner;

public class Workspace
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(scan.nextLine());
        int op2 = Integer.parseInt(sb.reverse().toString());
        int op1 = Integer.parseInt(sb.reverse().toString());
        System.out.println(op1-op2);  
    }
}