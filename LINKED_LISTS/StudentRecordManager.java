package DSA.LINKED_LISTS;

public class StudentRecordManager {
    static class StudentNode {
        int rollNumber, age;
        String name, grade;
        StudentNode next;

        StudentNode(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    StudentNode head = null;

    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 0) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < pos && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll)
            temp = temp.next;
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }

    void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManager srm = new StudentRecordManager();
        srm.addAtEnd(101, "Alice", 20, "A");
        srm.addAtBeginning(102, "Bob", 21, "B");
        srm.addAtPosition(1, 103, "Charlie", 22, "A-");
        srm.display();
        srm.updateGrade(103, "B+");
        srm.searchByRoll(103);
        srm.deleteByRoll(101);
        srm.display();
    }
}

