package AssignmentQuestions;

public class EveryElementRepeatedTwice {
    public static void main(String[] args) {
        int[] arr ={3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};

        // int result = uniqueElement(arr);
        int result2 = uniqueElementBinarySearch(arr);

        System.out.println(result2);
    }


    // Idea 1 -- > using xor operator
    // tc : O(N) sc : O(1)

    public static int uniqueElement(int[] arr)
    {
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            ans ^= arr[i];
        }

        return ans;
    }

    // Idea 2 : ---- >  using binary search

    /*
     * Approach :
     *   all first occurances of duplicates before unique element is even then i can go right
     * all first occurances of duplicates after unquiue element is odd then i can go for left
     */

     // tc : O(logN) sc : O(1)

    public static int uniqueElementBinarySearch(int[] arr)
    {
        int l = 0, r = arr.length-1;
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        while(l <= r)
        {
            int m = (l+r)>>1;
            if(arr[m] != arr[m-1] && arr[m]!= arr[m+1])
            {
                return arr[m];
            }

            if(arr[m] == arr[m-1]){
                m = m-1;
            }
            // now m is at first occurances

            if(m % 2 == 0) l = m+2;
            else r = m-1;
        }

        return -1;
    }
}
