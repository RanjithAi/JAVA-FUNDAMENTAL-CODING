import java.util.Scanner;
import java.util.Arrays;

public class q25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int[] numbers1 = new int[n1];
        int[] numbers2 = new int[n2];
        for(int i = 0;i<n1;i++)
        {
            numbers1[i]=scan.nextInt();
            for(int j=0;j<n2;j++)
            {
                numbers2[j]=scan.nextInt();
            }
        }

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.println(Arrays.equals(numbers1,numbers2));
            }
        }
        
    }
}
