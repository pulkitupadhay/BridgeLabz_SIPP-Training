import java.util.*;
import java.util.stream.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiryDate;
    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }
}

public class Q4_FilteringExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(25)),
            new Member("David", LocalDate.now().plusDays(5))
        );
        LocalDate today = LocalDate.now();
        List<Member> expiringSoon = members.stream()
            .filter(m -> !m.getExpiryDate().isBefore(today) &&
                         !m.getExpiryDate().isAfter(today.plusDays(30)))
            .collect(Collectors.toList());
        expiringSoon.forEach(m -> System.out.println(m.getName() + " expires on " + m.getExpiryDate()));
    }
}

