package Level_1;

import java.util.*;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm = input.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double remInches = inches % 12;
        System.out.printf("%d\n%.2f\n", feet, remInches);
    }
}
