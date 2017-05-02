/**
 * Created by chaoli on 2017/5/2.
 */
public class permutationII {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if (nums == null) {
            return results;
        }

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }

        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        //boolean[] visited = new boolean[num.length];
        List<Integer> permute = new ArrayList<Integer>();
        helper(results,permute,nums,visited);

        return results;
    }

    private void helper(List<List<Integer>> results, List<Integer> permute,int[] nums,boolean[] visited) {

        if (permute.size() == nums.length) {
            results.add(new ArrayList<Integer>(permute));
            return ;
        }

        for (int i=0;i<nums.length;i++) {

            if (!visited[i]) {

                if (i>0 && nums[i] == nums[i-1] && visited[i-1]) { // very nice thought
                    return ;
                }

                permute.add(nums[i]);
                visited[i]=true;
                helper(results,permute,nums,visited);
                permute.remove(permute.size()-1);
                visited[i]=false;

            }
        }
    }
}
