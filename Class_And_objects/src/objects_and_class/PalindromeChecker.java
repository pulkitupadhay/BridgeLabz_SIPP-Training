package objects_and_class;

import java.util.Scanner;

public class PalindromeChecker {
    String text;

    public void getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        text = scanner.nextLine();
    }

    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome())
            System.out.println("The text is a palindrome.");
        else
            System.out.println("The text is not a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.getText();
        checker.displayResult();
    }
}
