import java.util.*;

public class q43 {
    String passorfail(int score)
    {
        if(score<35)
         return "fail";
        else
        return "pass";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalmarks = scan.nextInt();
        q43 obj = new q43();
        String result = obj.passorfail(totalmarks);
        System.out.println(result);
    }
}
