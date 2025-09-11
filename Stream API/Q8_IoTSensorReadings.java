import java.util.*;

public class Q8_IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(22.5, 30.1, 18.7, 25.0, 35.2);
        double threshold = 25.0;
        readings.stream()
            .filter(r -> r > threshold)
            .forEach(r -> System.out.println("Sensor reading above threshold: " + r));
    }
}

