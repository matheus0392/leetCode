package dev.mnascimento0392.leetCode._16;

import java.util.Arrays;

class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		if (length == 3) {
			return nums[0] + nums[1] + nums[2];
		}

		int nearest = nums[0] + nums[1] + nums[2];

		Arrays.sort(nums);
		for (int x = 0; x < nums.length; x++) {
			for (int y = x + 1, z = nums.length - 1; y < nums.length && z > y; /* y++, z-- */) {

				int sum = nums[x] + nums[y] + nums[z];
				nearest = Math.abs(nearest - target) < Math.abs(sum - target) ? nearest : sum;

				if (nearest == target) {
					return nearest;
				}

				if (sum > target) {
					z--;
				} else {
					y++;
				}
			}
		}

		return nearest;
	}
}