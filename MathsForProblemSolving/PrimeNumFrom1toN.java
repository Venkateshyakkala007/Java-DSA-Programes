package MathsForProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumFrom1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // for(int i = 1; i <=n ; i++)
    // {
    //   if(isPrime(i)) System.out.print(i+" ");
    // }

    // seives2(n);

    ArrayList<Integer> res = primeNumbers(n);

    System.out.println(res);
  }

  static void seives2(int n)
  {
    boolean[] prime  = new boolean[n+1];

    for(int i =0; i< prime.length; i++)
    {
      prime[i] = true;
    }

    prime[0] = prime[1] = false;

    for(int i = 2; i*i <=n; i++) 
    {
      if(prime[i]) {
        for(int j = i*i; j< n; j+=i){
          prime[j] = false;
        }
      }
    }

    for(int i = 0; i < n; i++) {
      if(prime[i]) System.out.print(i+" ");
    }
  }

  // seives algo
  static void seives(int n)
  {
    boolean[] prime = new boolean[n+1];

    for(int i =0; i< prime.length; i++)
    {
      prime[i] = true;
     }

     prime[0] = prime[1] = false;

     for(int i = 2; i< prime.length; i++)
     {
      if(prime[i])
      {
        for(int j = 2*i; j < prime.length; j = j +i) {
          prime[j] = false;
        }
      }
     }

     for(int i = 0; i< prime.length; i++)
     {
      if(prime[i]) System.out.print(i+" ");
     }
  }

  // time complexity : O(root(n))
  static boolean isPrime(int n)
  {
    int count = 0;
    for(int i = 1; i*i <= n; i++)
    {
      if(n % i == 0){
        count+= 2;
        if(n/i ==i)count--;
      }
    }

    return (count == 2);
  }

  static ArrayList<Integer> primeNumbers(int A) 
  {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    ArrayList<Boolean> bool  = new ArrayList<>();
    int n = A+1;
    for(int i = 0; i < n; i++)
    {
      bool.add(true);
    }

    bool.set(0,false);
    bool.set(1,false);

    for(int i = 2; i*i <= n; i++) {
      if(bool.get(i)) {
        for(int j = i*i; j < n; j = j + i) {
          bool.set(j,false);
        }
      }
    }

    for(int i = 0; i < n; i++) {
      if(bool.get(i)) primes.add(i);
    }

    return primes;
    
  }
}
