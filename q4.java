import java.util.Scanner;
class q4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        float score = scan.nextFloat();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My score is "+score/10+"/10");
        System.out.println("My department is "+dept);
    }
}
