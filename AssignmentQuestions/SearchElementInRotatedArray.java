package AssignmentQuestions;

public class SearchElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,10,1,2,3};
        int target = 2;


        // int result1 = linearSearch(arr, target);

        int pivot =  BinarySearchForPivot( arr);

        if(target > arr[0])
        {
            int result2 = binarySearchToFind( arr, target, 0, pivot-1);
            System.out.println(result2);
        }
        else {
            int result2 = binarySearchToFind(arr, target, pivot, arr.length-1);
            System.out.println(result2);

        }



    }

    // Idea 1 : using linear Search 
    // tc : O(n) sc : O(1)

    public static int linearSearch(int[] arr,int target)
    {
        for(int i=0 ; i < arr.length; i++)
        {
            if(arr[i] == target)  return i;
        }

        return -1;
    }

    // Idea 2 -- > Using binary Search
    // this approach takes tc : O(logn) sc : O(1)

    // find the pivot element


    public static int  BinarySearchForPivot(int[] arr)
    {
        int l = 0;
        int r = arr.length-1;

        int pivot = -1;

        while(l <= r)
        {
            int m = (l+r) >> 1;

            if(arr[m] >= arr[0])
            {
                // we are in part 1
                l = m+1;
            }
            else{
                pivot = m;
                r = m-1;
            }

        }

        return pivot;

    }

    // while using binaray search to == two things in mid
    // 1. target
     // 2. search space

    public static int binarySearchToFind(int[] arr, int target, int l, int r) 
    {
        while(l <= r)
        {
            int m = (l+r) >> 1;

            if(arr[m] > target) r= m -1;
            else if(arr[m] < target) l = m+1;
            else return m;
        }
        return -1;
    }


    // Idea 3 : Interviewr may ask followup question is do it in one binaray search 
    
}
