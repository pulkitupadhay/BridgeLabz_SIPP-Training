import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.displayEmployees();
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

public class Company_Department {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("John"));
        dev.addEmployee(new Employee("Priya"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Amit"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.displayCompany();
        comp = null;
    }
}
