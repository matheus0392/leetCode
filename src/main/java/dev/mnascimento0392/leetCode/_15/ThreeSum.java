package dev.mnascimento0392.leetCode._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> result = new ArrayList<>();

		for (int x = 0; x < nums.length; x++) {
			if (map.containsKey(nums[x])) {
				map.get(nums[x]).add(x);
				map.put(nums[x], map.get(nums[x]));
			} else {
				List<Integer> l = new ArrayList<>();
				l.add(x);
				map.put(nums[x], l);
			}
		}

		for (int x = 0; x < nums.length; x++) {
			for (int y = nums.length - 1; y > x; y--) {
				int sum = nums[x] + nums[y];
				List<Integer> list = map.get(-(sum));
				if (list != null) {
					for (int z = 0; z < list.size(); z++) {
						if (list.get(z) > x && list.get(z) < y) {
							result.add(List.of(nums[x], -(nums[x] + nums[y]), nums[y]));
							break;
						}
					}
				}
				while (y - 1 > x && nums[y] == nums[y - 1]) {
					y--;
				}
			}
			while (nums.length > x + 1 && nums[x] == nums[x + 1]) {
				x++;
			}
		}

		return result;
	}
}