package Constructor;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department + ", Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showManagerInfo() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager(2001, "Sales", 75000);
        m.displayEmployee();
        m.updateSalary(80000);
        m.showManagerInfo();
        m.displayEmployee();
    }
}
