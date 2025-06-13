package Level_2;

import java.util.*;
public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble(), height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaInch, areaCm);
    }
}