package epicdemo;

import java.util.*;

//Abstract Class: Patient
abstract class Patient {
 private String patientId;
 private String name;
 private int age;

 public Patient(String patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 public String getPatientId() { return patientId; }
 public String getName() { return name; }
 public int getAge() { return age; }

 public abstract double calculateBill();

 public void getPatientDetails() {
     System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
 }
}

//Interface: MedicalRecord
interface MedicalRecord {
 void addRecord(String record);
 List<String> viewRecords();
}

//InPatient class
class InPatient extends Patient implements MedicalRecord {
 private int daysAdmitted;
 private double dailyRate;
 private List<String> records = new ArrayList<>();

 public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
     super(patientId, name, age);
     this.daysAdmitted = daysAdmitted;
     this.dailyRate = dailyRate;
 }

 @Override
 public double calculateBill() {
     return daysAdmitted * dailyRate;
 }

 @Override
 public void addRecord(String record) {
     records.add(record);
 }

 @Override
 public List<String> viewRecords() {
     return records;
 }
}

//OutPatient class
class OutPatient extends Patient implements MedicalRecord {
 private double consultationFee;
 private List<String> records = new ArrayList<>();

 public OutPatient(String patientId, String name, int age, double consultationFee) {
     super(patientId, name, age);
     this.consultationFee = consultationFee;
 }

 @Override
 public double calculateBill() {
     return consultationFee;
 }

 @Override
 public void addRecord(String record) {
     records.add(record);
 }

 @Override
 public List<String> viewRecords() {
     return records;
 }
}

//Main Class
public class HospitalManagementDemo {
 public static void main(String[] args) {
     List<Patient> patients = new ArrayList<>();
     InPatient p1 = new InPatient("P001", "Alice", 30, 4, 1500);
     OutPatient p2 = new OutPatient("P002", "Bob", 25, 500);

     p1.addRecord("Admitted for fever");
     p1.addRecord("Prescribed antibiotics");
     p2.addRecord("Routine check-up");

     patients.add(p1);
     patients.add(p2);

     for (Patient patient : patients) {
         patient.getPatientDetails();
         System.out.println("Bill Amount: ₹" + patient.calculateBill());

         if (patient instanceof MedicalRecord) {
             MedicalRecord record = (MedicalRecord) patient;
             System.out.println("Medical Records: " + record.viewRecords());
         }

         System.out.println("----------------------------");
     }
 }
}
