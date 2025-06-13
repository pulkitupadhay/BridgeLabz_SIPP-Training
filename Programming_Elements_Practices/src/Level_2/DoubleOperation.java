package Level_2;

import java.util.*;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        System.out.printf("The results of Double Operations are %.2f, %.2f, and %.2f\n", a + b * c, a * b + c, c + a / b);
    }
}