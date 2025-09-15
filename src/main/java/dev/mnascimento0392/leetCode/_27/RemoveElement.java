package dev.mnascimento0392.leetCode._27;

class Solution {
	public int removeElement(int[] nums, int val) {
		int[] nums_ = new int[nums.length];

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums_[k++] = nums[i];
			}
		}

		for (int i = 0; i < nums_.length; i++) {
			nums[i] = nums_[i];
		}

		return k;
	}
}