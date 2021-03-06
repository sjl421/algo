package page68.q6767;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    HashSet<String> sounds;

    in.nextLine();
    while(t-- > 0) {
      String recording[] = in.nextLine().split("\\s");
      sounds = new HashSet<String>();
      String line;
      while(!(line = in.nextLine()).equals("what does the fox say?")) {
        String words[] = line.split("\\s");
        for(int i=2; i<words.length; i++) sounds.add(words[i]);
      }

      StringBuilder sb = new StringBuilder();
      for(String s : recording)
        if(!sounds.contains(s))
          sb.append(' ').append(s);
      System.out.println(sb.substring(1));
    }
  }
}
