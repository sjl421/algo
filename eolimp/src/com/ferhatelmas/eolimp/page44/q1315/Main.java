package com.ferhatelmas.eolimp.page44.q1315;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()) {
      String[] parts = in.nextLine().split(" ");
      System.out.println(Integer.parseInt(parts[0].replaceAll(",", "")) +
          Integer.parseInt(parts[1].replaceAll(",", "")));
    }
  }
}
