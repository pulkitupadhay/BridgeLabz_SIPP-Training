package Level_1;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378, km3, mile3;
        km3 = 4.0 / 3 * Math.PI * Math.pow(radiusKm, 3);
        mile3 = km3 / Math.pow(1.6, 3);
        System.out.printf("%.2f\n%.2f\n", km3, mile3);
    }
}
