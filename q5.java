import java.util.Scanner;
class q5{
    public static void main(String[] args) {
        {
            Scanner obj = new Scanner(System.in);
            int mark = obj.nextInt();
            if(mark>=35 && mark<=100)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }
    }
}
