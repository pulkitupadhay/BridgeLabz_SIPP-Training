package Strings;

import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        input = input.replaceAll("[^a-z]", ""); // Remove non-alphabetic characters

        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
