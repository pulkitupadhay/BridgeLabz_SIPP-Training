import java.util.ArrayList;

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order #" + orderId + " contains:");
        for (Product p : products) {
            p.show();
        }
    }
}


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println("Product: " + name + " - ₹" + price);
    }
}


class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrder();
        }
    }
}


public class Ecommerce_Platform {
    public static void main(String[] args) {
        Customer john = new Customer("John");

        Product laptop = new Product("Laptop", 70000);
        Product mouse = new Product("Mouse", 500);

        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        john.placeOrder(order1);
        john.showOrders();
    }
}
