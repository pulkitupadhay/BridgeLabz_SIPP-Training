package Level_2;

import java.util.*;
public class SquareSide2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", perimeter / 4, perimeter);
    }
}
