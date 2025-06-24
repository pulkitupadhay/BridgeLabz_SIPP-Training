package Constructor;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                           ", Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Sunita", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
