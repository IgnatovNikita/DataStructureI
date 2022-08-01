package com.company;
/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one
with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the
number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same
row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
Otherwise, output the original matrix.
 */
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    if (r * c != mat.length * mat[1].length) return mat;
    int io = 0, jo = 0;
    int[][] res = new int[r][c];
    for (int i = 0; i < r; i++){
        for (int j = 0; j < c; j++){
            res[i][j] = mat[io][jo];
            jo++;
            if (jo == mat[0].length){
                jo = 0;
                io++;
            }
        }
    }
    return res;
    }
}
