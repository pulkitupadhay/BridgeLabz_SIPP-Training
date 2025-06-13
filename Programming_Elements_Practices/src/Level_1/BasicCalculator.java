package Level_1;

import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        System.out.printf("%.2f\n%.2f\n%.2f\n%.2f\n", a + b, a - b, a * b, a / b);
    }
}
