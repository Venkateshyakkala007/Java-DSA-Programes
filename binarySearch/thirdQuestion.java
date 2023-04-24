package binarySearch;

public class thirdQuestion {
    public static void main(String[] args) {
        int[] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,10,15,15};
        // int k = 5;
        // int k = 10;
        int k = 15;
        
        int result = firstOccurances(arr, k);
        System.out.println(result);
        int result2 = lastOccurances(arr, k);
        System.out.println(result2);

    }

    public static int firstOccurances(int[] arr, int k)
    {
        int l = 0, r = arr.length -1;
        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r) >> 1;
            if(arr[mid] == k)
            {
                ans = mid;
                r =mid-1;
            }
            else if(arr[mid] > k) r = mid -1;
            else  l= mid +1;
        }

        return ans;

    }

    public static int lastOccurances(int[] arr, int k) {
        int l = 0, r = arr.length-1;

        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r) >> 1;
            if(arr[mid] == k) {
                ans = mid;
                l = mid+1;
            }
            else if(arr[mid] < k) l = mid+1;
            else r = mid-1;
        }
        return ans;
    }
}
