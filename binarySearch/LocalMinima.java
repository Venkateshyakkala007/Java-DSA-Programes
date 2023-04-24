package binarySearch;

public class LocalMinima {
    public static void main(String[] args) {
        int[] arr = {3,6,1,0,9,15,8};
        int result =  valleyEle(arr);
        System.out.println(result);
    }

    public static int valleyEle(int[] arr)
    {
        int n = arr.length;
        if(arr.length == 1) return 0;
        if(arr[0] <arr[1]) return 0;
        if(arr[n-1] < arr[n-2]) return n-1;
        int l =1 ,r = arr.length -2;
        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r)>>1;

            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                // go to left
                r = mid-1;
            } else l = mid+1;
        }

        return ans;
    }
}
