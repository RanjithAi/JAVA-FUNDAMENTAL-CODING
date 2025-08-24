import java.util.Scanner;
class q12{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = obj.nextInt();
        System.out.println("Enter the number 2:");
        int b = obj.nextInt();
        for(int i = a; i>=b;i=i-1)
        {
            System.out.println(i);
        }
    }
}