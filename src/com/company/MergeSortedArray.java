package com.company;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
        representing the number of elements in nums1 and nums2 respectively.

        Merge nums1 and nums2 into a single array sorted in non-decreasing order.

        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
        be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* int[] d = new int[m+n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < m+n; i++){
            if (nums1[i1] < nums2[i2]) {
                d[i] = nums1[i1];
                i1++;
            }else {
                d[i] = nums2[]
            }
        }*/
        int i2 = 0;
        for (int i = m; i < n+m; i++){
            nums1[i] = nums2[i2];
            i2++;
        }
        Arrays.sort(nums1);
       // System.out.println(Arrays.toString(nums1));
    }
}
