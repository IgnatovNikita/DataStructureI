package com.company;
/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}
