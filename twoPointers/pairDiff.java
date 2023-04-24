package twoPointers;

public class pairDiff {
  public static void main(String[] args) {
    // int[] arr = {-3,0,1,3,6,8,11,14,18,25};
    // int[] arr= {8, 12, 16, 4, 0, 20};
    // int[] arr = {1,1,1,2,2};
    int[] arr = {1,5,3,4,2};

    // int target = 5;
    int target = 3;

    // if(pairdifferences2(arr, target)) {
    //   System.out.println("Element is found");
    // } else System.out.println("Element is not found");
      // System.out.println(pairdifferences(arr, target));

      System.out.println(pairdifferences4(arr,target));
  }

  // class room idea -4
  static int pairdifferences(int[] arr,int target)
  {
    int p1 = 0, p2 = 1;
    int count = 0;
    while(p2 < arr.length){
      int diff = arr[p2] - arr[p1];
      if( diff == target) count++;

      if(diff > target) {
        p1++;
        if(p1 == p2-1) p2++;
      }
      else p2++;
    }

    return count;
  }

  // Home work idea -5

  static boolean pairdifferences2(int[] arr,int target) {
    int n = arr.length;
    int p1 = n-2 , p2 = n-1;

    while (p1 >= 0)
    {
      if(arr[p2] - arr[p1] == target) return true;

      else if(arr[p2] - arr[p1] > target){
        p2--;
        if(p1 == p2) p1--;
      }
      else p1--;
    }
    return false;
  }

  // count of all differences pairs equal to B
  static int pairdifferences4(int[] arr,int target) { 
    int n = arr.length;

    int count =0;
    int p1 = 0, p2 =1;

    while(p2 < n) {
      int diff = arr[p2] - arr[p1];
      if( diff == target){
        count++;
        while(p2 < n-1 && arr[p1] == arr[p2]) {
          p2++;
        }
        p2++;
      } 
      else if(diff > target) {
        p1++;
        if(p1 == p2) p2++;
      } else p2++;

    }
    return count;
  }
}
