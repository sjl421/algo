package page14.q1318;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNextInt()) {
      int r = in.nextInt(), n = in.nextInt();
      System.out.printf(Locale.US, "%.6f\n", r / Math.sqrt(n * n - 1) * 2);
    }
  }
}
