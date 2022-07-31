package com.company;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays
and you may return the result in any order.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int k : nums1) {
            if (map1.containsKey(k)) {
                map1.put(k, map1.get(k) + 1);
            } else {
                map1.put(k, 1);
            }
        }
        for (int k : nums2) {
            if (map2.containsKey(k)) {
                map2.put(k, map2.get(k) + 1);
            } else {
                map2.put(k, 1);
            }
        }

        for (int i: map1.keySet()) {
            if (map2.containsKey(i)){
                for ( int j = 0; j < Math.min(map1.get(i), map2.get(i)); j++){
                    arr.add(i);
                }
            }
        }

        int [] res = new int[arr.size()];
        for (int i = 0; i< arr.size(); i++){
            res[i] = arr.get(i);
        }

        return res;
    }
}
