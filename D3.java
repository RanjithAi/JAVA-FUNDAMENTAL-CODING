//The task: Check if a given integer x is a palindrome — meaning it reads the same forward and backward. 
//Simple idea, but it comes with interesting edge cases
// Q9.PALINDROME

import java.util.*;
public class D3{
    public static boolean ispalindrome(int x){
        if(x<0) return false;
        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(ispalindrome(num)){
            System.out.println("It is Palindrome.");
        }else{
            System.out.println("It is not Palindrome.");
        }
    }
}