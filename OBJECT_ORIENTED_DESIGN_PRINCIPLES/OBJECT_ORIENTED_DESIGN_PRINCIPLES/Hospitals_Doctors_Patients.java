import java.util.ArrayList;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public String getName() {
    return name;
}

    public void consult(Patient p) {
        if (!patients.contains(p)) {
            patients.add(p);
        }
        System.out.println("Dr. " + name + " is consulting " + p.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class Hospitals_Doctors_Patients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        drSmith.consult(alice);
        drSmith.consult(bob);

        drJones.consult(bob);

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.showPatients();
        drJones.showPatients();

        hospital.showDetails();
    }
}

