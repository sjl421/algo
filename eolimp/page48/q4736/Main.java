package page48.q4736;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    isDivisible(new BigInteger(new Scanner(System.in).next()), new String[]{"11"});
  }

  private static void isDivisible(BigInteger n, String ns[]) {
    for(String i : ns) {
      System.out.println(n.mod(new BigInteger(i)).intValue() == 0 ? "Yes" : "No");
    }
  }
}
