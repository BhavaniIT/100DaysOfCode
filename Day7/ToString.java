package Day7;

class Employee
{
    String name;
    int id;

    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Name:"+ name+"\n"+
                "Id:" + id;
    }
}

public class ToString 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee("Bhavani",100);
        System.out.println(e); //usually it prints obj referece
        //any obj internally calls toString method
        //so if we override toString it will return as per our need
    }
}
