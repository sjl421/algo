package page14.q1379;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean flag;
    int l;
    String s;
    StringBuilder sb;
    while(in.hasNext() && !(s = in.next()).equals("~")) {
      flag = s.equals("0");
      sb = new StringBuilder();
      while(!(s = in.next()).equals("#")) {
        l = s.length();
        if(l == 1) flag = true;
        else if(l == 2) flag = false;
        else
          for(int i=2; i<l; i++) sb.append(flag ? '1' : '0');
      }
      System.out.println(Integer.parseInt(sb.toString(), 2));
    }
  }
}
