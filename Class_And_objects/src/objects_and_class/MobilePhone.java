package objects_and_class;

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public void getPhoneDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone brand: ");
        brand = scanner.nextLine();
        System.out.print("Enter phone model: ");
        model = scanner.nextLine();
        System.out.print("Enter phone price: ");
        price = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.getPhoneDetails();
        phone.displayDetails();
    }
}
