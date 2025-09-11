import java.util.*;

public class Q7_EventAttendeeWelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Alice", "Bob", "Charlie", "David");
        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
    }
}

