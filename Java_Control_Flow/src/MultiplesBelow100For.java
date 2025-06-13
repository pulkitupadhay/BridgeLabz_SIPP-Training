import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (<100): ");
        int num = sc.nextInt();
        if (num < 1 || num >= 100) {
            System.out.println("Not a valid positive integer (<100)!");
            return;
        }
        System.out.print("Multiples: ");
        for (int i = num; i < 100; i += num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
