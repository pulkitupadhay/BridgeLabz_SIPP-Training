import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Critical", "Normal", "Info", "Emergency");
        Predicate<String> filter = a -> a.equals("Critical") || a.equals("Emergency");
        alerts.stream().filter(filter).forEach(System.out::println);
    }
}
