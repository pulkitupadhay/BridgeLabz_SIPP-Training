package Level_1;

import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        boolean isFirstSmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}
