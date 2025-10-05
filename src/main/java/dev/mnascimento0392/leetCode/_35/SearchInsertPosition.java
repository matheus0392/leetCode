package dev.mnascimento0392.leetCode._35;

class Solution {
	public int searchInsert(int[] nums, int target) {

		int start = 0, end = nums.length - 1, index = -1;

		while (start <= end) {
			index = (start + end) / 2;

			if (nums[index] == target) {
				return index;
			}

			if (nums[index] < target) {
				start = index + 1;
			} else {
				end = index - 1;
			}
		}

		if (target > nums[index]) {
			return ++index;
		}

		return index;

	}
}