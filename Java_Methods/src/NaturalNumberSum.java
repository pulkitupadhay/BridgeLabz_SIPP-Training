package Methods;

import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int recSum = sumRecursive(n);
        int formSum = sumFormula(n);
        System.out.println("Recursive sum: " + recSum);
        System.out.println("Formula sum: " + formSum);
        System.out.println("Results match: " + (recSum == formSum));
    }
}
