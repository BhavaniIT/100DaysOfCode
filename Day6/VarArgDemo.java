package Day6;

public class VarArgDemo {

    public static void main(String[] args) 
    {
      sum();
      sum(10,20);
      sum(30,40,50,20,10);  
    }

    public static void sum(int... a)  //Only 3 dots not more than that
    {
        int total = 0;
        for(int a1 : a)
        {
            total += a1;
        }
        System.out.println("The total sum is:"+total);
    }
    
}
