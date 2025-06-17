package Methods;

import java.util.Random;

public class OTPGenerator {
    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.print("OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println();
        System.out.println("All OTPs unique? " + areOTPsUnique(otps));
    }
}
