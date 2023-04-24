package twoPointers.HomeWork;

public class pairGiveSum {
  public static void main(String[] args) {
    // int[] arr = {1,1};
    // int[] arr = {1, 2, 6, 6, 7, 9, 9 };
    int[] arr = {2 ,3 ,3 ,5 ,7 ,7 ,8 ,9 ,9 ,10 ,10 };
    int target = 11;

    System.out.println(countOfPairs(arr, target));
  }


  public static int countOfPairs(int[] arr, int k)
  {
    int ans = 0;
    for(int i =0; i < arr.length-1; i++)
    {
      ans += BS(arr,k-arr[i],i+1,arr.length-1);
    }
    return ans;
  }

  public static int BS(int[] arr, int target, int s, int e)
  {
    
    int low = s, high = e;
    int count = 0;
    while(low <= high)
    {
      int mid = (low+high) >> 1;

      if(arr[mid] == target) count++;;

      if(arr[mid] > target) high = mid -1;
      else low = mid +1;
    }

    return count;
  }
}
