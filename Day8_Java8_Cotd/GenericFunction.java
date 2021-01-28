package Day8_Java8_Cotd;
import java.util.ArrayList;
import java.util.function.Function;
class Student
{
    int marks;
    String name;
    Student(String name, int marks)
    {
        this.marks = marks;
        this.name = name;
    }
}

public class GenericFunction 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Bhavani",90));
        al.add(new Student("Ganga",75));
        al.add(new Student("Kavery",50));
        al.add(new Student("Yamuna",40));

        Function<Student,String> f = s -> s.marks >= 80?"A[Distinction]":
                                    s.marks>=60?"B[FC]":s.marks >= 50? "C[SC]":"Try next time";

        for(Student s : al)
        {
            System.out.println(s.name+":"+f.apply(s));
        }


    }
}
