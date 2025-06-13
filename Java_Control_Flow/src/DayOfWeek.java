import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        if (m < 3) { m += 12; y--; }
        int k = y % 100;
        int j = y / 100;
        int h = (d + 13*(m+1)/5 + k + k/4 + j/4 + 5*j) % 7;
        // Adjust to your output format: 0=Sun, 1=Mon, etc.
        // For Zeller, h=0=Sat, h=1=Sun, h=2=Mon, ..., h=6=Fri
        // To match your requested output (0=Sun), subtract 1 and mod 7, but beware of negatives
        int day = (h + 6) % 7; // This maps Zeller's h=1 (Sun) to 0, h=2 (Mon) to 1, etc.
        System.out.println("Day of the week: " + day);
    }
}
