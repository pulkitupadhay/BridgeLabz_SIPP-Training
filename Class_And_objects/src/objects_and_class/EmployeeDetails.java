package objects_and_class;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        emp.name = scanner.nextLine();

        System.out.print("Enter Salary: ");
        emp.salary = scanner.nextDouble();

        System.out.println("\n--- Employee Details ---");
        emp.displayDetails();
    }
}
