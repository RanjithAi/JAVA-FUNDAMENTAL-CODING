import java.util.Scanner;
class q21{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j =1;j<=row;j++)
            {
                if(i>=j)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}