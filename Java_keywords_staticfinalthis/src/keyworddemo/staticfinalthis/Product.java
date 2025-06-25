package keyworddemo.staticfinalthis;

public class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 50000, 2);
        Product p2 = new Product(202, "Mouse", 500, 5);

        p1.display();
        p2.display();

        Product.updateDiscount(15.0);
    }
}
