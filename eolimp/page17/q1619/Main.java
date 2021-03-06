  package page17.q1619;

  import java.util.Arrays;
  import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(), ns[] = new int[n],
          cnt[] = new int[n];

      for(int i=0; i<ns.length; i++) ns[i] = in.nextInt();
      Arrays.fill(cnt, 1);

      for(int i=1; i<n; i++)
        for(int j=0; j<i; j++)
          if(ns[i] > ns[j] && cnt[i] < cnt[j] + 1)
            cnt[i] = cnt[j] + 1;

      int max = 0;
      for(int i : cnt) max = Math.max(max, i);
      System.out.println(max);
    }
  }
