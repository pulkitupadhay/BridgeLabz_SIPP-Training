import java.util.*;

public class Q9_EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("alice@example.com", "bob@example.com", "charlie@example.com");
        emails.forEach(email -> sendEmailNotification(email));
    }
    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}

