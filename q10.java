import java.util.Scanner;
class q10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b =  scan.nextInt();
        String result = (a>b)?"A is greater":"B is greater";
        System.out.print(result);
    }
}