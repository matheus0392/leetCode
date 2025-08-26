package dev.mnascimento0392.leetCode._wc463q3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean partitionArray(int[] nums, int k) {

    	if (k == 1) {
            return true;
        }
    	
        if (nums.length % k != 0) {
            return false;
        }

        Map<Integer, Integer> quantity = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            if (quantity.containsKey(nums[x])) {
                Integer currentValue = quantity.get(nums[x]);
                quantity.put(nums[x], currentValue + 1);
            } else {
                quantity.put(nums[x], 1);
            }
        }

        for (Integer x : quantity.values()) {
            if (x > nums.length/k) {
                return false;
            }
        }

        if (nums.length == k) {
            for (Integer x : quantity.values()) {
                if (x > 1) {
                    return false;
                }
            }
        }

        return true;

    }
}