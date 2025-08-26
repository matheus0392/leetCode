package dev.mnascimento0392.leetCode._wc463q4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

	public int[] maxValue(int[] nums) {
		int ans[];

		ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int k = nums[i];

			for (int x = 0; x < nums.length; x++) {
				if (x < i) {
					if (nums[x] > k) {
						k = nums[x];
					}
				} else if (x > i) {
					if (nums[x] > k) {
						for (int y = x; y < nums.length; y++) {
							if (nums[y] < k) {
								k = nums[x];
								break;
							}
						}
					}
				}
			}
			ans[i] = k;
		}

		return ans;
	}

	/*public int[] maxValue2(int[] nums) {

		ans = new int[nums.length];
		Arrays.fill(ans, -1);

		for (int i = 0; i < nums.length; i++) {
			boolean found = false;

			for (int j = i; j >= 0; j--) {
				if (history.get(j) != null && history.get(j).contains(i)) {
					ans[i] = ans[j];
					Set<Integer> newSet = history.get(j);
					newSet.add(i);
					history.put(j, newSet);
					found = true;
					break;
				}
			}

			if (!found) {
//----------------------------------------------
				// ans[i] = jumpGame(nums, i);
//----------------------------------------------
				int k = nums[i];
				set.add(i);

				for (int x = 0; x < nums.length; x++) {
					if (x < i) {
						if (nums[x] > k) {
							k = nums[x];
							set.add(x);
						}
					} else if (x > i) {
						if (nums[x] > k) {
							for (int y = x; y < nums.length; y++) {
								if (nums[y] < k) {
									k = nums[x];
									set.add(y);
									set.add(x);
									break;
								}
							}
						}
					}
				}
				ans[i] = k;
//----------------------------------------------
				history.put(i, set);
				set = new HashSet<Integer>();
			}
		}

		return ans;
	}

	private int jumpGame(int[] nums, int i) {

		set.add(i);

		int val = nums[i];

		for (int j = i - 1; j >= 0; j--) {
			if (nums[i] < nums[j]) {
				if (ans[j] > -1) {
					return ans[j];
				}
				if (!set.contains(j)) {
					int val2 = jumpGame(nums, j);
					val = val2 > val ? val2 : val;
				}
			}
		}

		for (int j = i + 1; j < nums.length; j++) {
			if (nums[i] > nums[j]) {
				if (!set.contains(j)) {
					int val2 = jumpGame(nums, j);
					val = val2 > val ? val2 : val;
				}
				if (j >= nums.length) {
					return val;
				}
			}
		}

		return val;
	}*/
}