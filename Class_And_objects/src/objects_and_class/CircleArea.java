package objects_and_class;

import java.util.Scanner;

class Circle {
    double radius;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter radius: ");
        circle.radius = scanner.nextDouble();

        System.out.println("\n--- Circle Details ---");
        circle.display();
    }
}
