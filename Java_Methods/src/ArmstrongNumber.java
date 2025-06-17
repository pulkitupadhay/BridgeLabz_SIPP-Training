package Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
