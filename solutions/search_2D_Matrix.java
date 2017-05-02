/**
 * Created by chaoli on 2017/5/2.
 */
public class search_2D_Matrix {

    //2016
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here

        // 每行二分，面试官肯定不满意

        //tips1：首先定位行， 因为每一行都比上一行大， 所以如果找12，只可能在第二行


        //tips2：最后的一行的，这行的行首 <= target ，最后的满足条件的位子


        //method1: 先二分在哪一行的 方法，再二分在哪一列的方法
        //method2: 小聪明的方法 二维数组和一维数组坐标转换的方法， 先/ 再mod

        if(matrix==null || matrix.length==0){
            return false;
        }

        int start=0;
        int row=matrix.length;
        int end=row-1;


        //第一次二分，找出target所在的行
        while(start+1<end){
            int mid=start+(end-start)/2;

            if(matrix[mid][0]>target){
                end=mid;
            }
            else if(matrix[mid][0]<target){
                start=mid;
            }
            else{
                return true;
            }
        }


        if(matrix[end][0]<=target){
            row=end;

        }
        else if(matrix[start][0]<=target){
            row=start;
        }
        else {
            return false;
        }


        //第二次二分，找出target所在的列
        int s=0;
        int length=matrix[row].length;
        int e=length-1;
        while(s+1<e){
            int m=s+(e-s)/2;
            if(matrix[row][m]>target){
                e=m;
            }
            else if(matrix[row][m]<target){
                s=m;
            }
            else {
                e=m;
            }
        }

        if(matrix[row][e]==target){
            return true;
        }
        if(matrix[row][s]==target){
            return true;
        }

        return false;
    }

    //2017
}
