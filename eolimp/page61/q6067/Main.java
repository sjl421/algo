package page61.q6067;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger mod = BigInteger.valueOf(1000000007);
    int t = in.nextInt();

    while(t-- > 0) {
      BigInteger b = BigInteger.valueOf(in.nextInt());

      switch (in.nextInt()) {
        case 1:
          System.out.println(b.multiply(b.add(BigInteger.ONE))
              .divide(BigInteger.valueOf(2))
              .mod(mod)
              .toString());
          break;
        case 2:
          System.out.println(b.multiply(b.add(BigInteger.ONE))
              .multiply(b.multiply(BigInteger.valueOf(2)).add(BigInteger.ONE))
              .divide(BigInteger.valueOf(6))
              .mod(mod)
              .toString());
          break;
        case 3:
          System.out.println(b.multiply(b.add(BigInteger.ONE))
              .divide(BigInteger.valueOf(2))
              .pow(2)
              .mod(mod)
              .toString());
          break;
        case 4:
          System.out.println(b.multiply(b.add(BigInteger.ONE))
              .multiply(b.multiply(BigInteger.valueOf(2)).add(BigInteger.ONE))
              .multiply(b.pow(2).multiply(BigInteger.valueOf(3))
                  .add(b.multiply(BigInteger.valueOf(3)))
                  .subtract(BigInteger.ONE))
              .divide(BigInteger.valueOf(30))
              .mod(mod)
              .toString());
          break;
      }
    }
  }
}
