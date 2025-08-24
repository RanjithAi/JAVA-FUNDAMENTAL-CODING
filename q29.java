import java.util.*;

public class q29{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>20 || n<0)
        {
            System.out.println("Invalid input");
        }

        int[] num = new int[n];
        fillArrayofIntegers(num);
        printArrayofIntegers(num);

    }
    private static void printArrayofIntegers(int[] num)
    {
        System.out.println("The elements are ");
        System.out.println(Arrays.toString(num));
    }
    private static void fillArrayofIntegers(int[] num)
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<num.length;i++)
        {
            num[i]=scan.nextInt();
        }
    }
}