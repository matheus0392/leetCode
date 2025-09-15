package dev.mnascimento0392.leetCode._26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	public int removeDuplicates(int[] nums) {

		Set<Integer> set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		List<Integer> list = new ArrayList<>();
		set.forEach(t -> {
			list.add(t);
		});
		list.sort(Comparator.naturalOrder());
		list.toArray();

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return list.size();

	}
}