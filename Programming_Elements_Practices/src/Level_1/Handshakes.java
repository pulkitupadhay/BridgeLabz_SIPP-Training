package Level_1;

import java.util.*;
public class Handshakes {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      System.out.printf("%d\n", (n * (n - 1)) / 2);
  }
}