/**
 * Created by chaoli on 2017/5/2.
 */
public class permutation {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (nums == null) {
            return results;
        }

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }

        List<Integer> permute = new ArrayList<Integer>();
        helper(results,permute,nums);

        return results;
    }

    private void helper(List<List<Integer>> results,List<Integer> permute,int[] nums) {


        //chu kou
        if (permute.size() == nums.length) {
            results.add(new ArrayList<Integer>(permute)); // zhi xu yao wei permute kai pi yi ge  kong jian
        }

        //chai jie
        for (int i=0;i<nums.length;i++) {

            if (permute.contains(nums[i])) {
                continue;
            }
            permute.add(nums[i]);
            helper(results,permute,nums);
            permute.remove(permute.size()-1);
        }

    }

}
