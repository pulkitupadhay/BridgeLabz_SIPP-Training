package Level_1;

import java.util.Scanner;

public class NaturalSumComparisonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++)
            sumFor += i;
        int sumFormula = n * (n + 1) / 2;
        System.out.println("For loop sum: " + sumFor);
        System.out.println("Formula sum: " + sumFormula);
        System.out.println("Both results match: " + (sumFor == sumFormula));
    }
}
