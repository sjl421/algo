package page17.q1621;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BigInteger b = new BigInteger(new Scanner(System.in).next());
    int c = b.compareTo(BigInteger.ZERO);
    System.out.println((c < 0 ? -1 : 1) *
        (b.multiply(c < 0 ? b.subtract(BigInteger.ONE) : b.add(BigInteger.ONE))
          .shiftRight(1)
          .longValue() - (c < 0 ? 1 : 0)));
  }
}
