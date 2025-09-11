import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }
    public String toString() {
        return name + " | Price:" + price + " | Rating:" + rating + " | Discount:" + discount;
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 50000, 4.5, 10),
            new Product("Phone", 20000, 4.7, 15),
            new Product("Watch", 5000, 4.2, 20)
        );
        products.sort((a,b) -> Double.compare(a.price, b.price));
        System.out.println("By Price: " + products);
        products.sort((a,b) -> Double.compare(b.rating, a.rating));
        System.out.println("By Rating: " + products);
        products.sort((a,b) -> Double.compare(b.discount, a.discount));
        System.out.println("By Discount: " + products);
    }
}
