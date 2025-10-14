package dev.mnascimento0392.leetCode._41;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int firstMissingPositive(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				set.add(nums[i]);
			}
		}

		for (int i = 1; i <= set.size() + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}

		return nums.length;
	}
}