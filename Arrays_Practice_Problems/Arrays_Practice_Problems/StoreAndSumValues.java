import java.util.Scanner;
public class StoreAndSumValues {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }
            numbers[index] = num;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total sum of entered numbers: " + total);
    }
}


