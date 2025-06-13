package Day_1;

public class UniversityFee {
    public static void main(String[] args) {
        int fee = 125000, discountPercent = 10;
        double discount = fee * discountPercent / 100.0;
        System.out.printf("%.2f\n%.2f\n", discount, fee - discount);
    }
}
