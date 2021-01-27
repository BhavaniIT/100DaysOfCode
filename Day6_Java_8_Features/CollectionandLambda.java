package Day6_Java_8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionandLambda
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(3);
        al.add(4);

        Comparator<Integer> c = (I1,I2) -> (I1 > I2)? 1 : (I1 < I2)? -1 : 0;
        Collections.sort(al, c);

    }
}


//Without using lambda expression

// class MyComparator implements Comparator<Integer>
// {
//     public int compare(Integer I1, Integer I2)
//     {
//         if(I1 > I2)
//         return 1;
//         else if(I1 < I2)
//         return -1;
//         else
//         return 0;
//     }
// }

// public class CollectionandLambda {
//     public static void main(String[] args) {
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         al.add(10);
//         al.add(5);
//         al.add(3);
//         al.add(4);
//         Collections.sort(al, new MyComparator());
//         System.out.println(al);
//     }
    
// }
