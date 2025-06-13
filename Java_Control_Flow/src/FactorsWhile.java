import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Not a positive integer!");
            return;
        }
        int i = 1;
        System.out.print("Factors: ");
        while (i <= num) {
            if (num % i == 0) System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
