package AssignmentQuestions;

public class SquareRootOfGivenNumber {
    // questionis related to floor of square root of a number
    public static void main(String[] args) {
        int n = 23;
        // int result1 = sqrtUsingInbuiltFun(n);
        // int result2 = sqrt(n);
        int result3 = sqrtUsingBinarySearch(n);

        System.out.println(result3);
    }

    // Idea 1 : Use inbuilt function  -- > we can implment this is idea 3
    // tc : O(logn) sc : O(1);

    public static int sqrtUsingInbuiltFun(int n)
    {
        return (int)Math.sqrt(n);
    }


    // Idea2 : using brute force technquie --
    // tc : O(root(n)) and sc : O(1);


    public static int sqrt(int n)
    {
        int i = 1;
        int ans = 0;

        while( i*i <= n)
        {
            ans = i;
            i++;
        }

        return ans;
    }

    // Idea 3: we are using binary search to implment this
    // tc : O(logn) sc : O(1); same like inbuilt function and inbuilt function also implemnted using binary search
    
    public static int sqrtUsingBinarySearch(int n)
    {
        int l = 1 , r = n;
        int ans = 0; // beooz, it convers the test case n == 0

        while(l <= r)
        {
            int mid = (l+r) >> 1;

            int square = mid*mid;

            // if(square == n) return mid;

            if(square > n) r = mid-1;
            else 
            {
                ans = mid;
                l = mid+1;
            }
        }

        return ans;
    }
}