import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            multiplicationResult[i] = number * multiplier;
        }
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
    }
}

