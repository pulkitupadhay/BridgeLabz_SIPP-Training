package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
    }
}
