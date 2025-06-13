package Level_1;

import java.util.*;
public class UniversityFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double percent = input.nextDouble();
        double discount = fee * percent / 100;
        System.out.printf("%.2f\n%.2f\n", discount, fee - discount);
    }
}
