package Level_2;

import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        System.out.printf("The results of Int Operations are %d, %d, and %d\n", a + b * c, a * b + c, c + a / b);
    }
}