import java.util.ArrayList;

class Course {
    private String name;
    private Professor professor;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println(prof.getName() + " is assigned to teach " + name);
    }
}


class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course c) {
        c.assignProfessor(this);
    }
}


class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.getName());
    }

    public void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}


public class University_Management {
    public static void main(String[] args) {
        Professor profJane = new Professor("Prof. Jane");
        Course math = new Course("Mathematics");

        profJane.assignCourse(math);

        Student sam = new Student("Sam");
        sam.enrollCourse(math);

        sam.showCourses();
    }
}
