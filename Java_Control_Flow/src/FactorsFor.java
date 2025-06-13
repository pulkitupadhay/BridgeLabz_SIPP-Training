import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Not a positive integer!");
            return;
        }
        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
