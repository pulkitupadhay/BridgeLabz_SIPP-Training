package Methods;

import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumberSign(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = checkNumberSign(n);
        System.out.println(result);
    }
}
