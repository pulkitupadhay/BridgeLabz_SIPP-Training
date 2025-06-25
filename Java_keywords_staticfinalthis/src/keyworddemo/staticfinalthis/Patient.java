package keyworddemo.staticfinalthis;

public class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(501, "Anjali", 30, "Fever");
        Patient p2 = new Patient(502, "Rahul", 45, "Diabetes");

        p1.display();
        p2.display();

        Patient.getTotalPatients();
    }
}
