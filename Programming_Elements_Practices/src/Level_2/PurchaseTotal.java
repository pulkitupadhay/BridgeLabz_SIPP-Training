package Level_2;

import java.util.*;
public class PurchaseTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int qty = input.nextInt();
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n", price * qty, qty, price);
    }
}