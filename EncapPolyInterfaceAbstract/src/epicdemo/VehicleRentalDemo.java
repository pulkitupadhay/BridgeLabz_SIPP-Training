package epicdemo;

import java.util.*;

//Abstract Class: Vehicle
abstract class Vehicle {
 private String vehicleNumber;
 private String type;
 private double rentalRate;

 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 public String getVehicleNumber() { return vehicleNumber; }
 public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

 public String getType() { return type; }
 public void setType(String type) { this.type = type; }

 public double getRentalRate() { return rentalRate; }
 public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

 public abstract double calculateRentalCost(int days);
}

//Interface: Insurable
interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
}

//Car class
class Car extends Vehicle implements Insurable {
 private String insurancePolicyNumber;

 public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Car", rentalRate);
     this.insurancePolicyNumber = insurancePolicyNumber;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 @Override
 public double calculateInsurance() {
     return 1000;
 }

 @Override
 public String getInsuranceDetails() {
     return "Car Insurance Policy: " + insurancePolicyNumber;
 }
}

//Bike class
class Bike extends Vehicle implements Insurable {
 private String insurancePolicyNumber;

 public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Bike", rentalRate);
     this.insurancePolicyNumber = insurancePolicyNumber;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days * 0.9; // 10% discount
 }

 @Override
 public double calculateInsurance() {
     return 500;
 }

 @Override
 public String getInsuranceDetails() {
     return "Bike Insurance Policy: " + insurancePolicyNumber;
 }
}

//Truck class
class Truck extends Vehicle implements Insurable {
 private String insurancePolicyNumber;

 public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Truck", rentalRate);
     this.insurancePolicyNumber = insurancePolicyNumber;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days * 1.2; // 20% surcharge
 }

 @Override
 public double calculateInsurance() {
     return 2000;
 }

 @Override
 public String getInsuranceDetails() {
     return "Truck Insurance Policy: " + insurancePolicyNumber;
 }
}

//Main class
public class VehicleRentalDemo {
 public static void main(String[] args) {
     List<Vehicle> vehicles = new ArrayList<>();
     vehicles.add(new Car("KA01AB1234", 2000, "CAR12345"));
     vehicles.add(new Bike("KA01BC5678", 500, "BIKE67890"));
     vehicles.add(new Truck("KA01CD9101", 3000, "TRUCK11223"));

     int days = 5;
     for (Vehicle v : vehicles) {
         System.out.println(v.getType() + " " + v.getVehicleNumber() +
             " Rental Cost for " + days + " days: " + v.calculateRentalCost(days));

         if (v instanceof Insurable) {
             Insurable ins = (Insurable) v;
             System.out.println("Insurance Amount: " + ins.calculateInsurance());
             System.out.println(ins.getInsuranceDetails());
         }

         System.out.println("-----------------------------");
     }
 }
}
