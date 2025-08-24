import java.util.*;

public class q34 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int maxrange = scan.nextInt();
        int n = scan.nextInt();
        int newnum = 0;
        int count = 0;
        if(n<0 || n>maxrange)
        {
            System.out.print("Invalid number");
            return;
        }
        List<Integer> generatednumbers = new ArrayList<>();
        while(newnum!=n)
        {
            newnum = rand.nextInt(maxrange);
            System.out.println(newnum);
            generatednumbers.add(newnum);
            count++;
        }
        System.out.println("Total random numbers generated: " +count);
        System.out.print("All generated numbers: "+generatednumbers);
    }
}