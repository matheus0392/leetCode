package dev.mnascimento0392.leetCode._39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	Set<String> already = new HashSet<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		int[] candidates_ = Arrays.stream(candidates).filter(c -> c <= target).toArray();
		Arrays.sort(candidates_);
		List<List<Integer>> resp = new ArrayList<>();
		for (int i = 0; i < candidates_.length; i++) {
			sum(resp, candidates_, new ArrayList<Integer>(), target, 0);
		}
		return resp;
	}

	private void sum(List<List<Integer>> resp, int[] candidates_, List<Integer> arrayList, int target, int sum) {

		for (int i = 0; i < candidates_.length; i++) {
			int currentSum = sum + candidates_[i];
			if (currentSum > target) {
				continue;
			}
			if (currentSum == target) {
				List<Integer> list = new ArrayList<>();
				list.addAll(arrayList);
				list.add(candidates_[i]);
				List<Integer> sorted = list.stream().sorted().toList();
				 if (!already(resp, sorted)) {
		            resp.add(sorted);
		            return;
		         }
				return;
			}
			List<Integer> list = new ArrayList<>();
			list.addAll(arrayList);
			list.add(candidates_[i]);
			sum(resp, candidates_, list, target, currentSum);
		}
	}

	private boolean already(List<List<Integer>> resp, List<Integer> list) {
		for (List<Integer> each : resp) {
			if (each.size() != list.size()) {
				continue;
			}
			for (int i = 0; i < each.size(); i++) {
				if (each.get(i) != list.get(i)) {
					break;
				}
				if (i == each.size() - 1) {
					return true;
				}
			}
		}
		return false;
	}
}