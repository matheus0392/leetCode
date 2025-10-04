package dev.mnascimento0392.leetCode._34;

class Solution {
	public int[] searchRange(int[] nums, int target) {

		if (nums.length == 0) {
			return new int[] { -1, -1 };
		}

		if (nums.length == 1) {
			if (nums[0] == target) {
				return new int[] { 0, 0 };
			} else {
				return new int[] { -1, -1 };
			}
		}

		int start = 0, end = nums.length - 1, index = -1;

		while (true) {
			if (end - start < 1) {
				return new int[] { -1, -1 };
			}

			index = start + ((end + 1 - start) / 2);
			if (nums[index] == target) {
				break;
			} else if (nums[index] > target) {
				if (end == index) {
					end--;
					if (nums[end] == target) {
						index = end;
						break;
					}
				} else {
					end = index;
				}
			} else {
				start = index;
			}
		}

		end = index;
		while (true) {
			if (nums.length > end + 1 && nums[end + 1] == target) {
				end++;
			} else {
				break;
			}
		}

		start = index;
		while (true) {
			if (start - 1 >= 0 && nums[start - 1] == target) {
				start--;
			} else {
				break;
			}
		}

		return new int[] { start, end };

	}
}