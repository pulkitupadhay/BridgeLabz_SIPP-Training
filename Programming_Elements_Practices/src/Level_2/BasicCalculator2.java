package Level_2;

import java.util.*;
public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f and %.2f\n", a, b, a + b, a - b, a * b, a / b);
    }
}