package twoPointers;
import java.util.*;
public class TwoSum {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<Integer>();

    Scanner sc = new Scanner(System.in);

    int[] arr ={3,7,8,12,19};
    int n = arr.length;

    int target = 100;

    // if(pairSum(arr, target)) {
    //   System.out.println("Element is found");
    // } else System.out.println("Element is not found");

    
    // if(pairSum2(arr, target)){
    //   System.out.println("element is found");
    // } else {
    //   System.out.println("Element is not found");;
    // }

    if(pairSum3(arr, target)) {
      System.out.println("element is found");
    } else {
      System.out.println("Element is not found");
    }

  }

  public static boolean  pairSum(int[] arr,int target) {
    HashSet<Integer> hs = new HashSet<>();

    for(int i = 0; i< arr.length; i++)
    {
      if(hs.contains(target - arr[i])) {
        return true;
      } else {
        hs.add(arr[i]);
      }
    }
    return false;
  } 

  // using binarysearch application -->  O(nlogn) sc : O(1) 
  public static boolean pairSum2(int[] arr, int target) 
  {
    for(int i = 0; i < arr.length; i++)
    {
      if(binarySearch(arr,target- arr[i], i+1, arr.length-1)){
        return true;
      }
      
    }
    return false;
  }
  // because array is sorted
  static boolean  binarySearch(int[] arr, int target, int s, int e)
  {
    int low = s, high = e;

    while(low <= high)
    {
      int mid = (low+high) >> 1;

      if(arr[mid] == target) return true;

      if(arr[mid] > target) high = mid -1;
      else low = mid +1;
    }

    return false;
  }


  // we can use two pointers only in array is sorted.
  public static boolean pairSum3(int[] arr, int target) 
  {
    int n = arr.length;

    int p1 = 0, p2 = n-1;

    while(p1 < p2) 
    {
      int sum = arr[p1] + arr[p2];
      if(sum == target) return true;

      else if(sum > target) p2--;
      else  p1++;
    }
    return false;
  }

}
