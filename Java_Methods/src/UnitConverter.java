package Methods;

import java.util.Scanner;

public class UnitConverter {
    public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKilograms(double p) { return p * 0.453592; }
    public static double convertKilogramsToPounds(double k) { return k * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));
        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(p));
        System.out.print("Enter Kilograms: ");
        double k = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(k));
        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(g));
        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(l));
    }
}
