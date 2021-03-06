package page16.q1540;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ns[] = new int[5];
    boolean f[] = new boolean[5], o[] = new boolean[3];

    while(true) {
      boolean flag = true;
      for(int i=0; i<5; i++) {
        ns[i] = in.nextInt();
        flag &= (ns[i] == 0);
      }
      if(flag) break;
      Arrays.fill(f, true);
      Arrays.fill(o, true);
      flag = true;
      for(int i=0; i<ns.length; i++) {
        f[i] = false;
        if(isPossible(ns, f, 1, ns[i])) {
          System.out.println("Possible");
          flag = false;
          break;
        }
        f[i] = true;
      }
      if(flag)
        System.out.println("Impossible");
    }
  }

  private static boolean isPossible(int ns[], boolean f[], int k, int r) {
    if(k >= 5)  return r == 23;

    for(int i=0; i<ns.length; i++) {
      if(f[i]) {
        f[i] = false;
        if(isPossible(ns, f, k+1, r + ns[i]) ||
           isPossible(ns, f, k+1, r - ns[i]) ||
           isPossible(ns, f, k+1, r * ns[i])) return true;
        f[i] = true;
      }
    }
    return false;
  }
}
