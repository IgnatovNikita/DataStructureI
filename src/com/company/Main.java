package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ContainsDuplicate cd = new ContainsDuplicate();
        //  MaximumSubarray ms = new MaximumSubarray();
        //int[] nums  = {3,2,4,5};
      //  System.out.println(cd.containsDuplicate(nums));
        //System.out.println(ms.maxSubArray(nums));
        // System.out.println(Arrays.toString(new TwoSum().twoSum(nums, 6)));
        new MergeSortedArray().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
