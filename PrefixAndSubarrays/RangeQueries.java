package PrefixAndSubarrays;

public class RangeQueries {
    public static void main(String[] args) {
        int[][] queries = {
            {3,10,5},
            {7,13,10},
            {0,12,1},
            {11,12,50},
            {13,13,10},
            {3,10,2}
        };

        int size = 14;

        // int[] result = update(queries, size);

        // for(int i = 0; i < result.length; i++)
        // {
        //     System.out.print(result[i] + " ");
        // }

        int[] result = optimalsol(queries, size);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] +" ");
        }
    }

    // tc : O(n*q) sc : O(n)
    public static int[] update(int[][] arr,int n) {
        int[] count = new int[n];

        for(int i =0 ;i < arr.length; i++)
        {
            int start = arr[i][0];
            int end = arr[i][1];
            int amount = arr[i][2];
            for(int j = start; j <= end; j++)
            {
                count[j] += amount;
            }
        }

        return count;
    }

    // optimal solution  use +- techquie here

    static int[] optimalsol(int[][] Q, int n)
    {
        int[] count = new int[n];

        for(int i = 0; i < Q.length; i++)
        {
            int start = Q[i][0];
            int end = Q[i][1];
            int amount = Q[i][2];

            count[start] += amount;
            if(end+1 < n) count[end+1] -= amount;
        }

        for(int i = 1; i < n; i++)
        {
            count[i] = count[i-1]+count[i];
        }

        return count;
    }
}
