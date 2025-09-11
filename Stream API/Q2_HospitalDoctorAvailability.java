import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public boolean isAvailableOnWeekend() { return availableOnWeekend; }
    public String toString() { return name + " - " + specialty; }
}

public class Q2_HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Lee", "Neurology", false),
            new Doctor("Dr. Patel", "Orthopedics", true),
            new Doctor("Dr. Kim", "Pediatrics", true)
        );
        doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(System.out::println);
    }
}
