//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// D4. ANAGRAM - #242

import java.util.*;

public class D4 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}

