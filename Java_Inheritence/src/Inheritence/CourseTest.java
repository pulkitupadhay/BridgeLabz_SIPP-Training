package Inheritence;

class Course {
    String courseName;
    int duration; // in weeks

    Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + " | Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks | Recorded: " + isRecorded);
        System.out.println("Fee: " + fee + " | Discount: " + discount + "%");
    }
}

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOP", 6, "Udemy", true, 3999, 10);
        poc.displayDetails();
    }
}
