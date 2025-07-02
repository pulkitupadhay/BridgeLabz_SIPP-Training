package epicdemo;

import java.util.*;

//Abstract Class: RideVehicle
abstract class RideVehicle {
 private String vehicleId;
 private String driverName;
 private double ratePerKm;

 public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
     this.vehicleId = vehicleId;
     this.driverName = driverName;
     this.ratePerKm = ratePerKm;
 }

 public String getVehicleId() { return vehicleId; }
 public String getDriverName() { return driverName; }
 public double getRatePerKm() { return ratePerKm; }

 public abstract double calculateFare(double distance);

 public void getVehicleDetails() {
     System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: ₹" + ratePerKm);
 }
}

//Interface: GPS
interface GPS {
 String getCurrentLocation();
 void updateLocation(String newLocation);
}

//RideCar class
class RideCar extends RideVehicle implements GPS {
 private String currentLocation;

 public RideCar(String vehicleId, String driverName, double ratePerKm, String location) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = location;
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance;
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}

//RideBike class
class RideBike extends RideVehicle implements GPS {
 private String currentLocation;

 public RideBike(String vehicleId, String driverName, double ratePerKm, String location) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = location;
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance * 0.9; // 10% discount
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}

//RideAuto class
class RideAuto extends RideVehicle implements GPS {
 private String currentLocation;

 public RideAuto(String vehicleId, String driverName, double ratePerKm, String location) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = location;
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 20; // ₹20 base fare
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}

//Main class
public class RideHailingDemo {
 public static void main(String[] args) {
     List<RideVehicle> rides = new ArrayList<>();
     rides.add(new RideCar("CAR123", "Ravi", 12.0, "MG Road"));
     rides.add(new RideBike("BIKE456", "Sita", 8.0, "BTM Layout"));
     rides.add(new RideAuto("AUTO789", "Amit", 10.0, "Indiranagar"));

     double distance = 10.0;

     for (RideVehicle v : rides) {
         v.getVehicleDetails();
         System.out.println("Estimated Fare for " + distance + " km: ₹" + v.calculateFare(distance));

         if (v instanceof GPS) {
             GPS gps = (GPS) v;
             System.out.println("Current Location: " + gps.getCurrentLocation());
             gps.updateLocation("Electronic City");
             System.out.println("Updated Location: " + gps.getCurrentLocation());
         }

         System.out.println("-----------------------------");
     }
 }
}
