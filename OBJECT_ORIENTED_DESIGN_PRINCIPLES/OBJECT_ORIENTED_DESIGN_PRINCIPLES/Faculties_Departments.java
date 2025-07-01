import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Faculty: " + name);
    }
}


class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Department: " + name);
    }
}


class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.show();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.show();
        }
    }
}


public class Faculties_Departments {
    public static void main(String[] args) {
        University uni = new University("Global University");

        Department cs = new Department("Computer Science");
        Department physics = new Department("Physics");

        Faculty profJohn = new Faculty("Prof. John");
        Faculty profSara = new Faculty("Prof. Sara");

        uni.addDepartment(cs);
        uni.addDepartment(physics);

        uni.addFaculty(profJohn);
        uni.addFaculty(profSara);

        uni.showDetails();
        uni = null;
    }
}
