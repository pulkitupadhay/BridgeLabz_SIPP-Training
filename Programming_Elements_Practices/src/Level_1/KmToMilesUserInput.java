package Level_1;

import java.util.*;
public class KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        System.out.printf("%.2f\n", km / 1.6);
    }
}