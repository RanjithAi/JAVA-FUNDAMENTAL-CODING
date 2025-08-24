import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        int sum =0;
        int product=1;
        double avg;
        for(int i=0;i<n;i++)
        {
            num[i]=scan.nextInt();
            sum+=num[i];
            product*=num[i];
        }
        avg = (double)sum/n;
        System.out.println("sum ="+sum);
        System.out.println("product="+product);
        System.out.println("average="+avg);
    }
}
