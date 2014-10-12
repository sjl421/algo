package page42.q4146;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    HashSet<Integer> s = new HashSet<Integer>();

    while(in.hasNext()) {
      String cmd = in.next();
      if("insert".equals(cmd)) s.add(in.nextInt());
      else if("delete".equals(cmd)) s.remove(in.nextInt());
      else System.out.println(s.contains(in.nextInt()));
    }
  }
}
