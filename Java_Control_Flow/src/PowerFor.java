import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Exponent must be non-negative!");
            return;
        }
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println("Result: " + result);
    }
}
