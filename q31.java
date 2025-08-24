
import java.util.*;
public class q31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
        {
            nums[i]=scan.nextInt();
        }
       int searchnum =scan.nextInt();
       System.out.println(getnum(nums,searchnum));
    }
    public static int getnum(int[] nums,int searchnum)
    {
        int occ=0;
        for(int i =0;i<nums.length;i++)
        {
            if(searchnum==nums[i])
            {
                occ++;
            }
        }
        return occ;
    }
    
}
