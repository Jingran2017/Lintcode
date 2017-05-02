/**
 * Created by chaoli on 2017/5/1.
 */
public class subSet {
        /**
         * @param S: A set of numbers.
         * @return: A list of lists. All valid subsets.
         */
        public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
            // write your code here
            //Resursion-- DFS

            ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
            //illegal判断
            //1. 第一件事情： 检查null pointer
            if (nums == null ){
                return null;
            }

            if (nums.length == 0) {

                results.add(new ArrayList<Integer>());
                return results;
            }

            Arrays.sort(nums); //先排个序

            //Recursiion
            //找到 []开头的所有subsets=>results
            subsetHelper(results, new ArrayList<Integer>(),nums, 0);

            return results;

        }

        //1.递归的定义： 接受什么参数，返回什么值，做了什么事
        // 以subset开头的所有子集放到results
        //从nums里面的startIndex开始
        private void subsetHelper(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> subset, int[] nums, int startIndex){


            //2 递归的第二个要素： 递归的出口
            //想一想 if什么情况，可以return 或者 什么时候记录答案
            //

            //在subset里面，每一个中间状态都是我们要的结果，
            results.add(new ArrayList<Integer>(subset));  //deep copy

            //results.add(subset); 这个不对


            //3. 递归的拆解
            //[] =>[1], [2], [3]


            //找到所有以subset+nums[i]开头的所有集合了

            //找到了所有以1开头的，需要开始找以2开头的，先要把1踢掉

            for (int i=startIndex;i<nums.length;i++) {

                subset.add(nums[i]);
                subsetHelper(results,subset,nums,i+1);
                subset.remove(subset.size()-1);
            }


    }
}
