package Day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Day7.Employee;


public class UserDefLambda 
{
    public static void main(String[] args) 
    {
        List<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("Bhavani", 106));
        al.add(new Employee("Ganga", 123));
        al.add(new Employee("Yamuna", 101));
        al.add(new Employee("Saraswathi", 156));
        al.add(new Employee("Kaveri", 111));
        System.out.println(al);
        //Sorting using comparator method
        //Comparator c = (e1,e2)->(e1.id >e2.id)? 1:(e1.id < e2.id) ?-1 :0);
        //it has reduced
        Collections.sort(al, (e1,e2)->(e1.id >e2.id)? 1:(e1.id < e2.id) ?-1 :0);
        System.out.println("Sorted based on Employee number:");
        System.out.println(al);
        System.out.println("Sorted based on Employee name:");
        Collections.sort(al, (e1, e2)-> e1.name.compareTo(e2.name));
        System.out.println(al);

    }
}
