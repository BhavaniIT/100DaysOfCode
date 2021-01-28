package Day8_Java8_Cotd;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
//Simple consumer program
//Consumer whose purchase value <1000 "silver customers"
//Consumer whose purchase value >1000 "golden customers"
//custoner whose purchase value >1500 "platinum customers"
//Customers whose purchase value >1500 and age >50 "Diamond Customers"

class Customers
{
    String name;
    int age;
    int purchaseValue;
    Customers(String name, int age, int purchaseValue)
    {
        this.name = name;
        this.age = age;
        this.purchaseValue = purchaseValue;
    }

}

public class CombinationOffunctions 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Name,Age,Purchase Value:");
        String s = scan.nextLine();
        String[] details = s.split(",");
        String name = details[0];
        int age = Integer.parseInt(details[1]);
        int purchaseValue = Integer.parseInt(details[2]);
        ArrayList<Customers> al = new ArrayList<Customers>();
        al.add(new Customers(name,age,purchaseValue));

        //Function used to check purchase value
        Function<Customers,String> f = a -> a.purchaseValue>1500?"Platinum Customer"
                                            :a.purchaseValue >1000?"GoldenCustomer"
                                            :"Silver Customer";

        //Predicate used to check age
        Predicate<Customers> p = p1 -> p1.age>50;

        //Consumer functions to print data
        Consumer<Customers> cu = c1 ->
        {
            System.out.println("Name:"+c1.name);
            System.out.println("Age:"+c1.age);
            System.out.println("Purchase Value:"+c1.purchaseValue);
        };


        for(Customers c:al)
        {
            if(p.test(c)&& f.apply(c)=="Platinum Customer")
            {
                System.out.println("Diamond Customer");
                cu.accept(c);
            }
            else
            {
                System.out.println(f.apply(c));
                cu.accept(c);
            }
        }
        scan.close();

        

    }
    
}
