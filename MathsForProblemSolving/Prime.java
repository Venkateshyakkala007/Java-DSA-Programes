package MathsForProblemSolving;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(isPrime(n)) {
      System.out.println("N is prime number");
    } else System.out.println("N is not a prime number");

  }

  static boolean prime(int n)
  {
    int count = 0;
    for(int i = 1; i <=n; i++) 
    {
      if(n%i == 0) count++;
    }
    if(count == 2) return true;

    return false;
  }

  static boolean isPrime(int n)
  {
    int count =0;
    for(int i = 1; i*i <= n; i++)
    {
      if(n % i ==0) {
        count += 2;
        if(n/i == i) count--;
      }
    }
    return (count == 2);
  }
}
