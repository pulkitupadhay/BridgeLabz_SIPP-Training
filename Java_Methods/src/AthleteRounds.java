package Methods;

import java.util.Scanner;

public class AthleteRounds {
    public static double numberOfRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();
        double rounds = numberOfRounds(a, b, c);
        System.out.printf("Number of rounds to complete 5km: %.2f\n", rounds);
    }
}
