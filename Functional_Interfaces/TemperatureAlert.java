import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 40.0;
        System.out.println(highTemp.test(35.0));
        System.out.println(highTemp.test(45.0));
    }
}
