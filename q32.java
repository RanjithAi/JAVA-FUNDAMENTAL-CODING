import java.util.*;

public class q32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++)
        {
            num[i]=scan.nextInt();
        }
        int min =num[0];
        int max = num[0];
        for(int i=1;i<n;i++)
        {
            max =(num[i]>max)?num[i]:max;
            min=(num[i]<min)?num[i]:min;
        }
        System.out.println("max = "+max+", min = "+min);
    }    
}
