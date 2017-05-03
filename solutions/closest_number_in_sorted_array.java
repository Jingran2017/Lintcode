
public class closest_number_in_sorted_array {
    public int closestNumber(int[] A, int target) {
        // Write your code here

        // any positoin of target
        if ( A == null || A.length ==0) {
            return -1;
        }

        int start=0;
        int end=A.length-1;

        while (start+1<end) {
            int mid=start+(end-start)/2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid]<target) {
                start=mid;
            } else if (A[mid]>target) {
                end=mid;
            }
        }

        if (target<=A[start]) {
            return start;
        } else if (target>=A[end]) {
            return end;
        } else if (target-A[start]>A[end]-target) {
            return end;
        } else if (target-A[start]<=A[end]-target) {
            return start;
        }

        return -1;
    }
}
