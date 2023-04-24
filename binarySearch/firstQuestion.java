package binarySearch;
class firstQuestion
{
    public static void main(String[] args)
    {
        int[] arr = {3,6,9,12,14,19,20};
        int k = 12;
        
        int result = BinarySearch(arr,k);

        System.out.println(result);
    } 

    public static int BinarySearch(int[] arr,int k)
    {
        int l = 0, r = arr.length;

        int mid = (l+r) >> 1;

        while(l <= r)
        {
            if(arr[mid] == k) return mid;

            else if(arr[mid] > k) 
            {
                r = mid - 1;
            }else l = mid+1;
        }

        return -1;
    }
}