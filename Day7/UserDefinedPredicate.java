package Day7;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class Student
{
    int marks;
    boolean having_GF;

    Student(int marks, boolean having_GF)
    {
        this.marks = marks;
        this.having_GF = having_GF;
    }

    @Override
    public String toString()
    {
        return "Marks:"+marks+" "+"Having GF:"+having_GF;
    }
}

public class UserDefinedPredicate 
{
    public static void main(String[] args) 
    {
        List<Student> l = new ArrayList<Student>();
        Predicate<Student> p = e -> e.marks > 90 && e.having_GF == true;
        System.out.println(p.test(new Student(98, true)));
        System.out.println(p.test(new Student(70,true)));
    }
}
