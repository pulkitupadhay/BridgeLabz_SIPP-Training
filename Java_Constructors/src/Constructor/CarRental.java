package Constructor;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    final double costPerDay = 1000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void calculateTotalCost() {
        double totalCost = rentalDays * costPerDay;
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                           ", Days: " + rentalDays + ", Total Cost: ₹" + totalCost);
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Ravi", "Honda City", 4);
        rental.calculateTotalCost();
    }
}
