package dev.mnascimento0392.leetCode._18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < nums.length - 1; x++) {
				for (int y = nums.length - 1; y > 0 && y > x - 1; y--) {
					for (int w = x + 1, z = y - 1; z > w;) {
						if (target == (long) nums[x] + nums[w] + nums[z] + nums[y]) {

							if (result.contains(List.of(nums[x], nums[w], nums[z], nums[y]))) {
								if (i % 2 == 0) {
									w++;
								} else {
									z--;
								}
								continue;
							}
							result.add(List.of(nums[x], nums[w], nums[z], nums[y]));
						}
						if (nums[x] + nums[w] + nums[z] + nums[y] < target) {
							w++;
						} else {
							z--;
						}
					}
				}
			}
		}

		return result;
	}
}