package Level_1;

import java.util.*;
public class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int qty = input.nextInt();
        System.out.printf("%.2f\n", price * qty);
    }
}
