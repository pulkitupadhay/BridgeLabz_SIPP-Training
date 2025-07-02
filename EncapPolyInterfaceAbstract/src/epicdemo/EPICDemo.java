package epicdemo;

import java.util.*;

//Abstract class: Employee
abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() { return employeeId; }
 public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public double getBaseSalary() { return baseSalary; }
 public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
 }
}

//Interface: Department
interface Department {
 void assignDepartment(String departmentName);
 String getDepartmentDetails();
}

//Full-time employee
class FullTimeEmployee extends Employee {
 public FullTimeEmployee(int employeeId, String name, double baseSalary) {
     super(employeeId, name, baseSalary);
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary(); // Fixed salary
 }
}

//Part-time employee
class PartTimeEmployee extends Employee {
 private int workHours;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
     super(employeeId, name, 0);
     this.hourlyRate = hourlyRate;
     this.workHours = workHours;
 }

 public int getWorkHours() { return workHours; }
 public void setWorkHours(int workHours) { this.workHours = workHours; }

 public double getHourlyRate() { return hourlyRate; }
 public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

 @Override
 public double calculateSalary() {
     return hourlyRate * workHours;
 }
}

//Full-time employee with department
class EmployeeWithDepartment extends FullTimeEmployee implements Department {
 private String department;

 public EmployeeWithDepartment(int employeeId, String name, double baseSalary) {
     super(employeeId, name, baseSalary);
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return department;
 }
}

//Main class
public class EPICDemo {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();

     FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000);
     PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20, 100);
     EmployeeWithDepartment ewd = new EmployeeWithDepartment(3, "Charlie", 60000);
     ewd.assignDepartment("Engineering");

     employees.add(fte);
     employees.add(pte);
     employees.add(ewd);

     for (Employee emp : employees) {
         emp.displayDetails();
         if (emp instanceof Department) {
             System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
         }
         System.out.println("------------------------");
     }
 }
}
