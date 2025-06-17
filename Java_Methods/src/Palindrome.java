package Methods;

public class Palindrome {
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - 1 - i];
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reversed[i]) return false;
        }
        return true;
    }

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.indexOf('0') > 0; // not at start
    }

    public static void main(String[] args) {
        int num = 1201;
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
    }
}
