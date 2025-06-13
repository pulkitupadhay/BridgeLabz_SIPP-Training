package Level_1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Is the first number the largest? " + (num1 == max));
        System.out.println("Is the second number the largest? " + (num2 == max));
        System.out.println("Is the third number the largest? " + (num3 == max));
    }
}
