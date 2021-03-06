package page10.q946;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double[][] points = new double[4][2];

    for(int i=0; i<points.length; i++)
      for(int j = 0; j<points[0].length; j++)
        points[i][j] = in.nextDouble();

    System.out.println(getArea(points));
  }

  private static double[] getLengths(double[][] points, int step) {
    double[] ds = new double[points.length/step];

    for(int i=0; i<points.length/step; i++) {
      double d = 0;
      for(int j=0; j<points[0].length; j++) {
        d += Math.pow(points[(i+step)%points.length][j]-points[i][j], 2);
      }
      ds[i] = Math.sqrt(d);
    }
    return ds;
  }

  private static long getArea(double[][] points) {
    double area = 4;
    for(double d : getLengths(points, 2))
      area *= Math.pow(d, 2);

    double s = 0;
    double[] sides = getLengths(points, 1);
    for(int i=0; i<points.length; i++)
      s += sides[i] * (i%2 == 0 ? sides[i] : -sides[i]);

    return round(0.25 * Math.sqrt(area - s*s));
  }

  private static int round(double d) {
    BigDecimal b = new BigDecimal(String.valueOf(d));
    b = b.setScale(1, BigDecimal.ROUND_UP);
    return (int)Math.round(b.doubleValue());
  }
}
