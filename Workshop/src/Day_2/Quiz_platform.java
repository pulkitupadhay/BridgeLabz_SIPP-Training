package Day_2;

import java.util.*;

class InvalidQuizSubmissionException extends Exception {
 public InvalidQuizSubmissionException(String message) {
     super(message);
 }
}

public class Quiz_platform {
    static String[] correctAnswers = {"A", "B", "C", "D", "A", "C", "B", "D", "B", "A"};
    static List<Integer> userScores = new ArrayList<>();

    public static int calculateScore(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer count does not match number of questions.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }

        userScores.add(score);
        return score;
    }

    public static String getGrade(int score) {
        if (score == 10) return "A+";
        else if (score >= 8) return "A";
        else if (score >= 6) return "B";
        else if (score >= 4) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int user = 1; user <= 2; user++) {
            System.out.println("\nEnter answers for User " + user + " (10 questions A-D):");
            String[] userAnswers = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Q" + (i + 1) + ": ");
                userAnswers[i] = sc.next();
            }

            try {
                int score = calculateScore(userAnswers);
                String grade = getGrade(score);
                System.out.println("Score: " + score + "/10");
                System.out.println("Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nAll User Scores:");
        for (int i = 0; i < userScores.size(); i++) {
            System.out.println("User " + (i + 1) + ": " + userScores.get(i));
        }
    }
}
