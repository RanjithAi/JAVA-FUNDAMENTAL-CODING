import java.util.*;
public class q42 {
    void passorfail(int num)
    {
        if(num<0 || num>100)
            System.out.println("Invalid number");
        else if (num>34 && num<=100) 
            System.out.println("Pass");
        else
            System.out.println("Fail");        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        q42 obj = new q42();
        obj.passorfail(number);
    }
}
