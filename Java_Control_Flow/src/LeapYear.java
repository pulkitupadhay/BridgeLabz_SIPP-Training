import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582 for Gregorian calendar.");
            return;
        }
        boolean isLeap;
        if (year % 4 != 0) isLeap = false;
        else if (year % 100 != 0) isLeap = true;
        else if (year % 400 == 0) isLeap = true;
        else isLeap = false;
        System.out.println(year + (isLeap ? " is a Leap Year." : " is not a Leap Year."));
    }
}
