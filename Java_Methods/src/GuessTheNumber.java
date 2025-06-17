package Methods;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1, guess, tries = 0;
        System.out.println("Guess the number between 1 and 100!");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
            else
                System.out.println("Congratulations! You guessed it in " + tries + " tries.");
        } while (guess != number);
    }
}
