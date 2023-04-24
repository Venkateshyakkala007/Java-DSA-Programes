package binarySearch.Home_work_questions;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50}
        };

        int B = 50;

        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0 ,right = n*m-1;

        while(left <= right)
        {
            int midPoint = (left+right) >> 1;

            int midPoint_element = matrix[midPoint / m][midPoint %m];

            if(midPoint_element > B) {
                right = midPoint-1;
            } else if(midPoint_element < B) left = midPoint + 1;
            else {
                System.out.println(midPoint / m +" "+ midPoint %m);
                break;
            }

        }
    }
}
