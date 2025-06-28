package Day_1;

import java.util.*;
class Student{
String name;
String[] subjects;
int[] marks;

public Student(String name, String[] subjects, int[] marks) {
    this.name = name;
    this.subjects = subjects;
    this.marks = marks;
}

public double getAverage() {
    int sum = 0;
    for (int mark : marks) {
        sum += mark;
    }
    return (double) sum / marks.length;
}

public String getGrade() {
    double avg = getAverage();
    if (avg >= 90) return "A+";
    else if (avg >= 80) return "A";
    else if (avg >= 70) return "B";
    else if (avg >= 60) return "C";
    else if (avg >= 50) return "D";
    else return "F";
}

public void displayReport() {
    System.out.println("--------- Report Card ---------");
    System.out.println("Student Name: " + name);
    System.out.println("Subjects and Marks:");
    for (int i = 0; i < subjects.length; i++) {
         System.out.printf(subjects[i]+" "+":"+" "+marks[i]+"\n");
     }
     System.out.printf("Average Marks : %.2f\n", getAverage());
     System.out.println("Grade : " + getGrade());
     System.out.println("--------------------------------\n");
 }
}

public class Student_Report {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     List<Student> studentList = new ArrayList<>();

     System.out.print("Enter number of students: ");
     int numStudents = sc.nextInt();
     sc.nextLine();

     for (int s = 0; s < numStudents; s++) {
    	 System.out.print("\nEnter student name: ");
    	 String name = sc.nextLine();
    	 System.out.print("Enter number of subjects: ");
    	 int numSubjects = sc.nextInt();
    	 sc.nextLine();
    	 String[] subjects = new String[numSubjects];
         int[] marks = new int[numSubjects];
         for (int i = 0; i < numSubjects; i++) {
        	 System.out.print("Enter subject name: ");
             subjects[i] = sc.nextLine();
             System.out.print("Enter marks for " + subjects[i] + ": ");
             marks[i] = sc.nextInt();
             sc.nextLine();
         }
         Student student = new Student(name, subjects, marks);
         studentList.add(student);
       }
     for (Student student : studentList) {
         student.displayReport();
     }
 }
}
