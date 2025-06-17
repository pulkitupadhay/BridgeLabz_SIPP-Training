package Methods;

import java.util.Scanner;

public class GeometryUtils {
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static String lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return "y = " + m + "x + " + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.printf("Euclidean distance: %.2f\n", euclideanDistance(x1, y1, x2, y2));
        if (x1 != x2)
            System.out.println("Line equation: " + lineEquation(x1, y1, x2, y2));
        else
            System.out.println("Line is vertical: x = " + x1);
    }
}
