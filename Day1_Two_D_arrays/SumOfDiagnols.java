package Day1_Two_D_arrays;

public class SumOfDiagnols {

    public static void main(String[] args) {
        
        int sum = 0;
        int[][] a = {
            {10,20,30},{40,50,60},{70,80,90}
        };

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                if(i==j)
                sum += a[i][j];
            }
        }

        System.out.println(sum);
    }
    
}
