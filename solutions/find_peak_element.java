
public class find_peak_element {

    //2017刷题
    public int findPeak(int[] A) {
        // write your code here

        if(A==null || A.length==0){
            return -1;
        }

        int start=0;
        int end=A.length-1;

        while (start+1<end) {
            int mid=start+(end-start)/2;
            if (A[mid]>A[mid-1] && A[mid]>A[mid+1]) {
                return mid;
            } else if (A[mid]>A[mid-1] && A[mid]<A[mid+1]) {
                start=mid;
            } else if (A[mid]<A[mid-1] && A[mid]>A[mid+1]) {
                end=mid;
            } else {
                end=mid;
            }
        }

        if (A[start]>=A[end]) {
            return start;
        }

        if (A[end]>A[start]) {
            return end;
        }

        return -1;
    }

    //九章答案
    public int findPeak(int[] A) {
        // write your code here
        int start = 1, end = A.length-2; // 1.答案在之间，2.不会出界
        while(start + 1 <  end) {
            int mid = (start + end) / 2;
            if(A[mid] < A[mid - 1]) {
                end = mid;
            } else if(A[mid] < A[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(A[start] < A[end]) {
            return end;
        } else {
            return start;
        }
    }
}
