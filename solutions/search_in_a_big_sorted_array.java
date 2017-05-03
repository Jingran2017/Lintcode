
public class search_in_a_big_sorted_array {

    //2016刷题
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here//
        // 难点： 没有end，因为数组非常大，没法取长度。

        //确定右边界：倍增法 *2 *2 *2
        // arrayList ， vector


        //Vector implements a dynamic array. It is similar to ArrayList, but with two differences:

        //1.Vector is synchronized.

        ///2. Vector contains many legacy methods that are not part of the collections framework
        //http://www.tutorialspoint.com/java/java_vector_class.htm



        // 1. get the index that ArrayReader.get(index) >= target in
        //    O(logk)
        // 2. Binary search the target between 0 and index


        //1.倍增法，快速找到first position >=target 的index区间


        int index=1;
        while(reader.get(index)-1<target){
            index=index*2;
        }

        //2. 二分法找到first poistion == target
        int start=0;
        int end=index-1;

        while(start+1<end){
            int mid=start+(end-start)/2;
            if(reader.get(mid)>target){
                end=mid;
            }
            else if(reader.get(mid)<target){
                start=mid;
            }
            else {
                end=mid;
            }
        }

        if(reader.get(start)==target){
            return start;
        }
        if(reader.get(end)==target){
            return end;
        }


        return -1;

    }

    //2017刷题
    
}
