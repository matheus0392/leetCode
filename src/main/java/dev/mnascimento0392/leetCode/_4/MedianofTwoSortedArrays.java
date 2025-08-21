package dev.mnascimento0392.leetCode._4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int sum = nums1.length + nums2.length;
        int[] array = new int[sum];

        int ind1 = 0, ind2 = 0;

        for (int x = 0; x < sum; x++) {

            if (ind1 < nums1.length && ind2 < nums2.length) {
                if (nums1[ind1] <= nums2[ind2]) {
                    array[x] = nums1[ind1];
                    ind1++;
                } else {
                     array[x] = nums2[ind2];
                    ind2++;
                }
            } else {
                if (ind1 < nums1.length){
                     array[x] = nums1[ind1];
                    ind1++;
                }else{
                    array[x] = nums2[ind2];
                    ind2++;
                }
            }
        }

        if (sum % 2 == 1) {
            return array[sum / 2];
        }

        return ( Double.valueOf(array[sum / 2 - 1]) +  Double.valueOf(array[sum / 2])) / 2;
    }
}