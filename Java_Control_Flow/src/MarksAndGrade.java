import java.util.Scanner;

public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chem = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int math = sc.nextInt();
        double avg = (phy + chem + math) / 3.0;
        String grade, remarks;
        if (avg >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (avg >= 80) { grade = "B"; remarks = "Very Good"; }
        else if (avg >= 70) { grade = "C"; remarks = "Good"; }
        else if (avg >= 60) { grade = "D"; remarks = "Satisfactory"; }
        else { grade = "F"; remarks = "Fail"; }
        System.out.printf("Average Mark: %.2f\n", avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
