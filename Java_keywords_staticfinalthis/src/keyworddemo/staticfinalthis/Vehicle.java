package keyworddemo.staticfinalthis;

public class Vehicle {
    static double registrationFee = 1500.0;

    final String registrationNumber;
    String ownerName, vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Fee: " + registrationFee);
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("KA01AB1234", "Ramesh", "Car");
        Vehicle v2 = new Vehicle("KA02CD5678", "Suresh", "Bike");

        v1.display();
        v2.display();

        Vehicle.updateRegistrationFee(1800.0);
    }
}
