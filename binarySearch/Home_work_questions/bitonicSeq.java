package binarySearch.Home_work_questions;

public class bitonicSeq {
    public static void main(String[] args) {
        int[] A = {5,6,7,8,9,10,3,2,1};
        int B = 30;

        int l = 0, r= A.length-1;
        int peak = -1;
        while( l<= r) {
            int m = l + (r-l)/2;

            if(A[m] > A[m+1] && A[m-1] > A[m]){
                r = m -1;
            }
            else if(A[m] > A[m-1] && A[m] < A[m+1]) l = m+1;
            else {peak = m; break;}
        }


        System.out.println(peak);

    }
}
