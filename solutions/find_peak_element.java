
public class find_peak_element {
    //2016刷题
    public int findPeak(int[] A) {
        // write your code here

        if(A==null || A.length==0){
            return -1;
        }

        int start=0;
        int end=A.length-1;
        while(start+1<end){
            int mid=start+(end-start)/2;
            if(A[mid]<A[mid+1]){
                start=mid;
            }
            else if(A[mid]>A[mid+1]){
                end=mid;
            }
        }

        if(A[start]>A[end]){
            return start;
        }
        else return end;
    }

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
}
