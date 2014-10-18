package page41.q4037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static class Key implements Comparable<Key> {

    int i, j, k;

    Key(int i, int j, int k) {
      this.i = i;
      this.j = j;
      this.k = k;
    }

    @Override
    public int compareTo(Key o) {
      int c = this.i - o.i;
      return c == 0 ? this.k - o.k : c;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Key ns[] = new Key[n];

    for(int i=0; i<n; i++) {
      ns[i] = new Key(in.nextInt(), in.nextInt(), i);
    }

    Arrays.sort(ns);
    for(Key k : ns)
      System.out.println(k.i + " " + k.j);
  }
}
