package Inheritence;

interface Refuelable {
    void refuel();
}

class Vehicle_V {
    int maxSpeed;
    String model;

    Vehicle_V(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle_V {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging Electric Vehicle: " + model);
    }
}

class PetrolVehicle extends Vehicle_V implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling Petrol Vehicle: " + model);
    }
}

public class HybridVehicleTest {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        ev.charge();
        pv.refuel();
    }
}
