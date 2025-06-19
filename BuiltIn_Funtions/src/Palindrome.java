package Built_In;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right)
            if (str.charAt(left++) != str.charAt(right--)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println(str + " is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
    }
}
