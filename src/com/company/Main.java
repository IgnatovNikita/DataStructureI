package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ContainsDuplicate cd = new ContainsDuplicate();
        //  MaximumSubarray ms = new MaximumSubarray();
        int[] nums1  = {1,2};
        int[] nums2 = {7,1,5,3,6,4};
      //  System.out.println(cd.containsDuplicate(nums));
        //System.out.println(ms.maxSubArray(nums));
        // System.out.println(Arrays.toString(new TwoSum().twoSum(nums, 6)));
        // new MergeSortedArray().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
       // System.out.println(Arrays.toString(new IntersectionofTwoArraysII().intersect(nums1, nums2)));
        //System.out.println(new BestTimetoBuyandSellStock().maxProfit(nums1));
        int[][] mat = {{1,2},{3,4}};
        //System.out.println(Arrays.deepToString(new ReshapetheMatrix().matrixReshape(mat, 1, 5)));
       // System.out.println(new PascalsTriangle().generate(30));
        char[][] sudoku = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(new ValidSudoku().isValidSudoku(sudoku));
    }
}
