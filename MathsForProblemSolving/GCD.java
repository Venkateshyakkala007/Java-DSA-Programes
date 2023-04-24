package MathsForProblemSolving;

import java.util.*;

public class GCD {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = (int)Math.abs(sc.nextInt());
      int b = (int)Math.abs(sc.nextInt());

      // System.out.println(GCD(a, b));
      System.out.println(gcd(a, b));

  }
  
  // reecursive way of writing the GCD code
  public static int GCD(int a,int b)
  {
      if(b == 0) return a;
      return GCD(b, a%b);
  }

   // Iterative way of writing GCD code is
   static int gcd(int n, int m) {
      if (n%m ==0) return m;
      if (n < m) swap(n, m);
      while (m > 0) {
          n = n%m;
          swap(n, m);
      }
      return n;
    }

   public static void swap(int a,int b)
   {
      int temp = b;
      b = a;
      a = temp;
   }
}
