package generics;
import java.util.*;
abstract class CourseType {
    public abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    public String getEvaluationType() { return "Exam-Based"; }
}

class AssignmentCourse extends CourseType {
    public String getEvaluationType() { return "Assignment-Based"; }
}

class ResearchCourse extends CourseType {
    public String getEvaluationType() { return "Research-Based"; }
}

class Course<T extends CourseType> {
    String name;
    T type;

    public Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Course: " + name + " | Evaluation: " + type.getEvaluationType());
    }
}

class CourseManager {
    public static void displayAll(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Type: " + course.getEvaluationType());
        }
    }
}
