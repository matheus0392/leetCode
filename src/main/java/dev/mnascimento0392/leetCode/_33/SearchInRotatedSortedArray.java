package dev.mnascimento0392.leetCode._33;

class Solution {
	public int search(int[] nums, int target) {

		if (nums.length == 1) {
			if (nums[0] == target) {
				return 0;
			} else {
				return -1;
			}
		}

		if (nums.length < 4) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					return i;
				}
			}
			return -1;
		}

		int start = 0, end = nums.length - 1, indexTest = 0, leftIndex = -1;
		while (true) {
			if (end - start <= 1) {
				leftIndex = end;
				if (indexTest + 1 == nums.length) {
					leftIndex = -1;
				}
				break;
			}
			indexTest = start + ((end + 1 - start) / 2);
			if (nums[start] < nums[indexTest]) {
				start = indexTest;
			} else {
				end = indexTest;
			}
		}

		if (leftIndex == -1) {
			return searchIndex(nums, 0, nums.length - 1, target);
		}

		if (target >= nums[0]) {
			return searchIndex(nums, 0, leftIndex, target);
		} else {
			return searchIndex(nums, leftIndex, nums.length - 1, target);
		}
	}

	int searchIndex(int[] nums, int start, int end, int target) {
		int index = 0, indexTest = -1;
		while (true) {
			if (end - start <= 1) {
				if (nums[start] == target)
					return start;
				if (nums[end] == target)
					return end;
				return -1;
			}
			indexTest = start + ((end - start) / 2);
			if (nums[indexTest] < target) {
				start = indexTest;
			} else {
				end = indexTest;
			}
		}
	}
}