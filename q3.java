import java.util.Scanner;
class q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        int f = d/e;
        System.out.println("The Multiplied number is "+d);
        System.out.println("The added number is "+e);
        System.out.print("The divided number is "+f);
    }
}
