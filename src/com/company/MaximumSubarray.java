package com.company;

import java.util.Arrays;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has
the largest sum and return its sum.
A subarray is a contiguous part of an array.
 */
public class MaximumSubarray {
    private int sumArray(int[] ar){
        int res = 0;
        for (int i:ar){
            res += i;
        }
        return res;
    }

    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int sum;
        for (int i = 0; i < nums.length; i++){
            int maxi = nums[i];
            for (int j = nums.length; j > i; j--){
                sum = sumArray(Arrays.copyOfRange(nums,i,j));
                if (maxi < sum) maxi = sum;
            }
            if (maxsum < maxi) maxsum = maxi;
        }


        return maxsum;
    }

    /* Быстрое решение
     int maxSoFar = nums[0];
        int currMax = nums[0];
        for (int i = 1; i <nums.length; i++){
            // just reset currMax to current element if it  is less than current element
            currMax = Math.max((currMax + nums[i]), nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar; 
     */
}
