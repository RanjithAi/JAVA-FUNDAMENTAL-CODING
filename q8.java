import java.util.Scanner;
class q8{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int score = obj.nextInt();
        if(score>35 && score<=60)
        {
            System.out.println("I can get Video game");
        }
        else if(score>60 && score<=90)
        {
            System.out.println("I can get Iphone");
        }
        else if(score>90 && score<=100)
        {
            System.out.println("I can get MacBook Pro");
        }
        else
        {
            System.out.println("Nothing fo you");
        }
    }
}