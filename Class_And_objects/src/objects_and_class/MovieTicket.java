package objects_and_class;

import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        movieName = scanner.nextLine();
        System.out.print("Enter seat number: ");
        seatNumber = scanner.nextLine();
        System.out.print("Enter ticket price: ");
        price = scanner.nextDouble();
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket();
        ticket.displayTicket();
    }
}
