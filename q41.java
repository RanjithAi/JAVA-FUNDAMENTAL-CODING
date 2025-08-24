import java.util.*;
public class q41 {
    void evenorodd(int num)
    {
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("odd");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        q41 obj = new q41();
        obj.evenorodd(number);
    }
}
