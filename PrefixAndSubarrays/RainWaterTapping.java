package PrefixAndSubarrays;

public class RainWaterTapping {
    public static void main(String[] args) {
    //    int[] arr = {1,0,3,4,2,8,9,0};
        int[] arr = {10,1,1,5,8,11,3,0};

        int collection = BruteForce(arr);

        System.out.println(collection);
        
        // int water = optimalSolution(arr);

        // System.out.println(water);
    }

    public static int BruteForce(int[] arr)
    {
        // for every element we need to check left max and right max then we need to take the min of both
        
        int n = arr.length;
        
        int water = 0;

        for (int i = 1; i <= n-2; i++) {

            int leftMax, rightMax;
            leftMax = rightMax = arr[i];

            for(int j = 0; j <= i; j++)
            {
                leftMax = Math.max(leftMax,arr[j]);
            }

            for(int j = i+1; j <n; j++)
            {
                rightMax = Math.max(rightMax,arr[j]);
            }

            water += Math.min(leftMax,rightMax) - arr[i];
        }

        return water;
        
    }


    public static int optimalSolution(int[] arr)
    {
        int n = arr.length;
        int[] preMax = new int[n];
        int[] postMax = new int[n];

        preMax[0]= arr[0];
        postMax[0] = arr[n-1];

        for(int i = 1; i < n; i++)
        {
            if(arr[i] > preMax[i-1]) {
                preMax[i] = arr[i];
            }else{
                preMax[i] = preMax[i-1];
            }

        }

        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] > postMax[i+1])
                postMax[i] = arr[i];
            else postMax[i] = postMax[i+1];
        }


        int water = 0;
        for(int i = 0; i < n ; i++)
        {
                water += Math.min(preMax[i],postMax[i]) - arr[i];
        }

        return water;
     }
}
