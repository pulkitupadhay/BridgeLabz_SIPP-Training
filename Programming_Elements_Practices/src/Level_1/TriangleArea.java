package Level_1;

import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble(), height = input.nextDouble();
        double areaInch = 0.5 * base * height, areaCm = areaInch * 6.4516;
        System.out.printf("%.2f\n%.2f\n", areaInch, areaCm);
    }
}