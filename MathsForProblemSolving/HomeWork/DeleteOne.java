package MathsForProblemSolving.HomeWork;

public class DeleteOne {
  public static void main(String[] args) {
    // int[] arr = {12,15,18};
    // int[] arr = {5,15,30};
    int[] arr = {3,9,6,8};
    int n = arr.length;
    int[] pf = new int[n];
    int[] sf = new int[n];

    pf[0] = arr[0];
    for(int i = 1; i < n; i++) 
    {
      pf[i] = GCD(pf[i-1] , arr[i]); 
    }

    sf[n-1] = arr[n-1];
    for(int i = n-2; i >=0; i--)
    {
      sf[i] = GCD(sf[i+1], arr[i]);
    }
   
    int gcd = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++){
      if(i == 0 ) gcd = Math.max(gcd,sf[i+1]);
      else if(i==n-1) gcd = Math.max(gcd, pf[i-1]);
      else gcd = Math.max(gcd, GCD(pf[i-1],sf[i+1]));
    }

    System.out.println(gcd);

   
  }

  public static int deleteOne(int[] arr)
  {
    int gcd = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++)
    {
      for(int j = 0 ; j < arr.length;j++)
      {
        if(i != j) {
          gcd = Math.max(gcd,GCD(arr[i], arr[j]));
        }
      }
    }

    return gcd;
  }

  public static int GCD(int a, int b)
  {
    if(b == 0 ) return a;
    return GCD(b,a%b);
  }
}
