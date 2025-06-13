package Level_1;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        System.out.println("Enter numbers (enter 0 or negative to stop):");
        while (true) {
            num = sc.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total: " + total);
    }
}
