import java.util.*;
import java.util.stream.*;

class Employee {
    String department;
    double salary;
    Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class Q4_EmployeeSalaryCategorization {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("HR", 50000),
            new Employee("IT", 70000),
            new Employee("HR", 60000),
            new Employee("IT", 80000)
        );
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);
    }
}

