package com.company;
/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

 */
public class Searcha2DMatrix {
    public int frow(int[][]matrix, int target){
        int m = matrix.length -1;
        int i = 0;
        int pos = (m + i) / 2;

        while (i <= m && !(matrix[pos][0] <= target && matrix[pos][matrix[0].length-1] >= target)){
            if (matrix[pos][0] < target) i = pos + 1;
            else m = pos - 1;
            pos = (m + i) / 2;

        }
        //if (matrix[i][0] == target) return i;
        //if (matrix[m][0] == target) return m;
        return pos;
    }
    public int f(int[][]matrix, int target, int i){
        int n = matrix[0].length -1;
        int j = 0;
        int pos = (n + j) / 2;

        while (j <= n && matrix[i][pos] != target){
            if (matrix[i][pos] < target) j = pos + 1 ;
            else n = pos - 1;
            pos = (n + j) / 2;
        }
       // if (matrix[i][j] == target) return j;
        //if (matrix[i][n] == target) return n;
        return pos;
    }


    public boolean searchMatrix(int[][] matrix, int target) {


             int i = frow(matrix, target);
             int j = f(matrix, target,i);
        System.out.println(i + " " + j);
       // if (j < 0) return  false;
        return matrix[i][j] == target;
    }
}
