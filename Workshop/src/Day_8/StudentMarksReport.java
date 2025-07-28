package Day_8;

import java.util.*;

public class StudentMarksReport {
    Map<String, List<Integer>> studentMarks = new HashMap<>();

    public void addMark(String student, int mark) {
        studentMarks.computeIfAbsent(student, k -> new ArrayList<>()).add(mark);
    }

    public double calculateAverage(String student) {
        List<Integer> marks = studentMarks.get(student);
        if (marks == null || marks.isEmpty()) return 0.0;

        int total = 0;
        for (int mark : marks) total += mark;
        return total / (double) marks.size();
    }

    public String getTopStudent() {
        String topStudent = null;
        double highestAvg = -1;

        for (String student : studentMarks.keySet()) {
            double avg = calculateAverage(student);
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void displayReport() {
        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() +
                               " | Avg: " + calculateAverage(entry.getKey()));
        }
    }

    public static void main(String[] args) {
        StudentMarksReport report = new StudentMarksReport();

        report.addMark("Alice", 90);
        report.addMark("Alice", 85);
        report.addMark("Bob", 70);
        report.addMark("Bob", 75);
        report.addMark("Charlie", 95);
        report.addMark("Charlie", 92);

        report.displayReport();

        System.out.println("Top Student: " + report.getTopStudent());
    }
}
