package binarySearch;

public class secondQuestion {
    public static void main(String[] args) {
        int[] arr ={-5,2,3,6,9,10,11,14,18};
        // int k = 5;
        // int k = 4;
        int k = -5;

        int result = floor(arr, k);
        System.out.println(result);

    }

    public static int floor(int[] arr, int k)
    {
        int l = 0, r= arr.length-1;

        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r)>>1;

            if(arr[mid] == k) return mid;

            else if(arr[mid] < k)
            {
                ans = mid;
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }

        return ans;
    }
}
