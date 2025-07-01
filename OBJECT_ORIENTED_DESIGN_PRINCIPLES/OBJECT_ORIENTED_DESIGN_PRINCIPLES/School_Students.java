import java.util.ArrayList;

class Course {
    private String name;
    private ArrayList<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student s) {
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}


class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.enrollStudent(this);
        }
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}


class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + name + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}


public class School_Students {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        alice.enroll(math);
        alice.enroll(science);

        bob.enroll(science);

        school.addStudent(alice);
        school.addStudent(bob);

        school.showStudents();

        alice.showCourses();
        bob.showCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
