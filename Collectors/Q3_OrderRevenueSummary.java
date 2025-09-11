import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;
    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class Q3_OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 100.0),
            new Order("Bob", 150.0),
            new Order("Alice", 200.0)
        );
        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)));
        System.out.println(revenue);
    }
}

