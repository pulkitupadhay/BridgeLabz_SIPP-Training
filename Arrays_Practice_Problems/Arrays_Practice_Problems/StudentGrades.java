import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                    j--;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80)
                grades[i] = 'A';
            else if (percentages[i] >= 70 && percentages[i] <= 79)
                grades[i] = 'B';
            else if (percentages[i] >= 60 && percentages[i] <= 69)
                grades[i] = 'C';
            else if (percentages[i] >= 50 && percentages[i] <= 59)
                grades[i] = 'D';
            else if (percentages[i] >= 40 && percentages[i] <= 49)
                grades[i] = 'E';
            else
                grades[i] = 'F';
        }

        System.out.println("\nStudent Report:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
