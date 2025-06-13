package Level_2;

import java.util.*;
public class FeetConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3, miles = yards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f\n", yards, miles);
    }
}