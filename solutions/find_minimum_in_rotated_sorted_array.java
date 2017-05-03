
public class find_minimum_in_rotated_sorted_array {

    public int findMin(int[] nums) {
        // write your code here

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start=0;
        int end=nums.length-1;

        while (start+1<end) {
            int mid=start+(end-start)/2;
            if (nums[mid]>nums[end]) { // 以最后一个数作为比较点
                start=mid;
            } else if (nums[mid]<nums[end]) {
                end=mid;
            }
        }

        if (nums[start]<nums[end]) {
            return nums[start];
        }

        if (nums[end]<nums[start]) {
            return nums[end];
        }

        return -1;
    }
}
