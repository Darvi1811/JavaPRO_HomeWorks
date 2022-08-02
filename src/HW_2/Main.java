package HW_2;

import java.util.Locale;

public class Main {
    static int wordsCount(String a) {
        return a.split(" ").length;
    }
    static boolean isPalindrome(String a) {
        StringBuilder b = new StringBuilder(a);
        return b.reverse().toString().equalsIgnoreCase(a);
    }
    public static void main(String[] args) {
        String a = "Glory to Ukraine!";
        String b = "loLoL";
        System.out.println(wordsCount(a));
        System.out.println(isPalindrome(b));
    }
}
