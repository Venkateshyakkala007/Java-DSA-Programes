package twoPointers;

public class ContainerWithMostWater {
  public static void main(String[] args) {
    int[] arr = {1};

    int ans = maxContainerWater(arr);

    System.out.println(ans);
    
  }

  public static int maxContainerWater(int[] arr)
  {
    int ans = 0;
    int height = Integer.MAX_VALUE;
    int width =0;
    int p1 = 0, p2 = arr.length-1;

    while(p1!=p2)
    {
      height = Math.min(arr[p1],arr[p2]);
      width = p2-p1;
      ans = Math.max(ans,height*width);

      if(arr[p1] < arr[p2]) p1++;
      else if(arr[p2] < arr[p1]) p2--;
      else p1++;
    }
    return ans;
  }
}
