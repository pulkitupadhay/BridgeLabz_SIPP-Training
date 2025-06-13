package Level_2;

import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n", a / b, a % b, a, b);
    }
}