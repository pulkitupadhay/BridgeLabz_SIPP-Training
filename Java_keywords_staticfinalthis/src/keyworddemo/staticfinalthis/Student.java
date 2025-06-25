package keyworddemo.staticfinalthis;

public class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Neha", 'A');
        Student s2 = new Student(2, "Arjun", 'B');

        s1.display();
        s2.display();

        Student.displayTotalStudents();
    }
}
