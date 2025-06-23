package Strings;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch)
                result.append(c);
        }

        System.out.println("Modified String: " + result);
    }
}
