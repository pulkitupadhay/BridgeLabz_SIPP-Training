package Built_In;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = low + rand.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (low/high/correct): ");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! I guessed your number.");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
