package Level_1;

import java.util.Scanner;

public class NaturalSumComparisonWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumWhile = 0, i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("While loop sum: " + sumWhile);
        System.out.println("Formula sum: " + sumFormula);
        System.out.println("Both results match: " + (sumWhile == sumFormula));
    }
}
