package keyworddemo.staticfinalthis;

class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Arun", "Developer");
        Employee e2 = new Employee(2, "Meera", "Tester");

        e1.display();
        e2.display();

        Employee.displayTotalEmployees();
    }
}
