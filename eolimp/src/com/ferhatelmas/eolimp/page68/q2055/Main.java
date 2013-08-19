package com.ferhatelmas.eolimp.page68.q2055;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    Stack<Integer> s = new Stack<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();
    boolean pqb, sb, qb;
    while(in.hasNextInt()) {
      pqb = true; sb = true; qb = true;
      pq.clear(); s.clear(); q.clear();
      for(int i=in.nextInt(); i>0; i--) {
        int t = in.nextInt(), v = in.nextInt();
        if(t == 1) {
          if(pqb) pq.add(v);
          if(sb) s.push(v);
          if(qb) q.add(v);
        } else {
          if(pqb) try { pqb = v == pq.poll(); } catch (Exception e) { pqb = false; }
          if(sb) try { sb = v == s.pop(); } catch (Exception e) { sb = false; }
          if(qb) try { qb = v == q.poll(); } catch (Exception e) { qb = false; }
        }
      }
      String typ;
      if(sb && !pqb && !qb) typ = "stack";
      else if(!sb && pqb && !qb) typ = "priority queue";
      else if(!sb && !pqb && qb) typ = "queue";
      else if(!sb && !pqb && !qb) typ = "impossible";
      else typ = "not sure";
      System.out.println(typ);
    }
  }
}
