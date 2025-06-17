import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        if (number < 0) {
            System.out.println("Error: Enter a non-negative number.");
            return;
        }

        int[] frequency = new int[10];

        while (number > 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number = number / 10;
        }
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }
    }
}
