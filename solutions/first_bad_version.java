
public class first_bad_version {


    //2017刷题
    public int findFirstBadVersion(int n) {
        //write your code here

        if (n==1) {
            return 1;
        }


        int start=1;
        int end=n; // base version is from 1 to n
        while (start+1<end) {
            int mid=start+(end-start)/2;
            if (SVNRepo.isBadVersion(mid) == true) {
                end=mid;
            } else {
                start=mid;
            }
        }

        if (SVNRepo.isBadVersion(start) == true && SVNRepo.isBadVersion(end) == true) {
            return start;
        }

        if (SVNRepo.isBadVersion(start) == false && SVNRepo.isBadVersion(end) == true) {
            return end;
        }

        return -1;
    }

    //九章答案
    public int findFirstBadVersion(int n) {
        int start = 1, end = n;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (SVNRepo.isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (SVNRepo.isBadVersion(start)) {
            return start;
        }
        return end;
    }
}
