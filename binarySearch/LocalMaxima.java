package binarySearch;

public class LocalMaxima {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {5,17,100,11};
        int result = peakEle(arr);
        System.out.println(result);
    }

    public static int peakEle(int[] arr)
    {
        int ans = -1;
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] > arr[1]){ return arr[0];}
        if(arr[n-1] > arr[n-2]) {return arr[n-1];}
        int l = 1, r= arr.length-2;
        while (l <= r)
        {
            int mid = (l+r) >> 1;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1] ){
                ans =mid;

            } else if(arr[mid] < arr[mid+1]) {
                l = mid+1;
            } else r = mid-1;
        }

        return arr[ans];
    }
}
