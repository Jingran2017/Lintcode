
public class subSet {
    public List<List<Integer>> subsets(int[] nums) {
        //1.
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if (nums == null) {
            return null;
        }

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());  // very import, convert ArrayList to List
            return results;
        }
        //2.
        Arrays.sort(nums);


        //3.Recursiion
        //找到 []开头的所有subsets=>results
        helper(results,new ArrayList<Integer>(),0,nums);

        return results;

    }

    //递归三要素
    //1.递归的定义： 接受什么参数，返回什么值，做了什么事
    // 在以subset开头的所有子集放到results
    //从nums里面的startIndex开始
    private void helper(List<List<Integer>> results,List<Integer> subset,int startIndex,int[] nums) {


        //2 递归的拆解拆解
        //deep copy
        results.add(new ArrayList<Integer>(subset)); //no reference copy
        //results.add(subset); // this is reference copy

        for (int i=startIndex;i<nums.length;i++) {

            subset.add(nums[i]);
            helper(results,subset,i+1,nums);
            subset.remove(subset.size()-1); //ArrayList.remove(int index)
        }
        //3. chu kou
    }

}
