
public class maximum_number_in_mountain_sequence {

    public int mountainSequence(int[] nums) {
        // Write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start=0;
        int end=nums.length-1;

        while (start+1<end) {
            int mid=start+(end-start)/2;

            if (nums[mid]<nums[mid+1] && nums[mid]>nums[mid-1]) {
                start=mid;
            } else if (nums[mid]>nums[mid+1] && nums[mid]<nums[mid-1]) {
                end=mid;
            } else if (nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
                return nums[mid];
            }
        }

        if (nums[start]>=nums[end]) {
            return nums[start];
        }

        if (nums[end]>nums[start]) {
            return nums[end];
        }

        return -1;
    }
}
