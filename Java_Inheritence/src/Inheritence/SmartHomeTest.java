package Inheritence;

class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("THERM-001", "Active", 24.5);
        t.displayStatus();
    }
}
