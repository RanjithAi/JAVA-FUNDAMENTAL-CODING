import java.util.*;
public class q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i, j;
        //int s=1;
        for(i=1;i<=n;i++){
            int t=i;
            for(j=1;j<=i;j++){
                System.out.print(t+" ");
                t=t+n-j;
            }
            System.out.println();
        }
    }
}
