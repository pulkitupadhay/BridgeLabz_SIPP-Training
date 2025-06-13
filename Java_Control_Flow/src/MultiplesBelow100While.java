import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (<100): ");
        int num = sc.nextInt();
        if (num < 1 || num >= 100) {
            System.out.println("Not a valid positive integer (<100)!");
            return;
        }
        System.out.print("Multiples: ");
        int multiple = num;
        while (multiple < 100) {
            System.out.print(multiple + " ");
            multiple += num;
        }
        System.out.println();
    }
}
