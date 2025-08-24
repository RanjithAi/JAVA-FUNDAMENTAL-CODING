import java.util.Scanner;
class q14{
    public static void main(String[] args)
     {
        int count = 0;
        for(int i = 1;i<=10;i++)
        if(i%2==0)
        {
            count++;
            System.out.print("Even numbers are : ");
            System.out.println(i);
        }
        System.out.println("Total even numbers are : "+count);
    }
}