package Day_3;

import java.util.*;

class Flight {
    String flightNumber;
    String origin;
    String destination;

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public void displayFlight() {
        System.out.println("Flight No: " + flightNumber + " | From: " + origin + " | To: " + destination);
    }
}

class Booking {
    String passengerName;
    Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void displayBooking() {
        System.out.println("Passenger: " + passengerName + " | Flight: " + flight.flightNumber +
                " (" + flight.origin + " to " + flight.destination + ")");
    }
}

public class FlightBookingSystem {
    static Flight[] availableFlights = {
        new Flight("AI101", "Delhi", "Mumbai"),
        new Flight("AI102", "Delhi", "Bangalore"),
        new Flight("AI103", "Mumbai", "Chennai"),
        new Flight("AI104", "Bangalore", "Delhi"),
        new Flight("AI105", "Chennai", "Kolkata")
    };

    static List<Booking> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    searchFlights();
                    break;
                case 2:
                    bookFlight();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
    }

    public static void searchFlights() {
        System.out.print("Enter origin city: ");
        String origin = sc.nextLine();
        System.out.print("Enter destination city: ");
        String destination = sc.nextLine();

        boolean found = false;
        System.out.println("\nAvailable Flights:");
        for (Flight flight : availableFlights) {
            if (flight.origin.equalsIgnoreCase(origin) &&
                flight.destination.equalsIgnoreCase(destination)) {
                flight.displayFlight();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found for this route.");
        }
    }

    public static void bookFlight() {
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter flight number to book: ");
        String flightNum = sc.nextLine();

        for (Flight flight : availableFlights) {
            if (flight.flightNumber.equalsIgnoreCase(flightNum)) {
                bookings.add(new Booking(name, flight));
                System.out.println("Flight booked successfully!");
                return;
            }
        }

        System.out.println("Flight number not found.");
    }

    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.println("\nBooking Details:");
        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }
}
