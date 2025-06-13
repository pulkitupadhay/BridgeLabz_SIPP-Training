package Level_1;

import java.util.*;
public class FeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3, miles = yards / 1760;
        System.out.printf("%.2f\n%.2f\n", yards, miles);
    }
}