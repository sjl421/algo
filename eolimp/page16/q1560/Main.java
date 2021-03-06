package page16.q1560;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] sieve = new int[1000001];
    sieve[0] = -1;
    for(int i=1; i<sieve.length; i++) {
      int r = sieve[i-1];
      if(i%2 == 0) r = Math.min(r, sieve[i/2]);
      if(i%3 == 0) r = Math.min(r, sieve[i/3]);
      r++;
      sieve[i] = r;
    }

    while(in.hasNextInt())
      System.out.println(sieve[in.nextInt()]);
  }
}
