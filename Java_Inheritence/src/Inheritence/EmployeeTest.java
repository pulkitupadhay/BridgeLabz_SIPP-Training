package Inheritence;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;

    Intern(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.internshipDuration = months;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 90000, 5),
            new Developer("Bob", 102, 80000, "Java"),
            new Intern("Charlie", 103, 20000, 6)
        };

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}
