package dev.mnascimento0392.leetCode._40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0 ; i < candidates.length; i++) {
			Integer x = map.putIfAbsent(candidates[i], 1);
			if (x != null) {
				map.put(candidates[i], x + 1);
			}
		}

		int totalSum = 0;
		List<Integer> newCandidates = new ArrayList<Integer>();
		for (Integer each : map.keySet()) {
			totalSum = 0;
			int totalCount = map.get(each);
			for (int i = 0; i < totalCount; i++) {
				map.put(each, map.get(each) - 1);
				newCandidates.add(each);
				totalSum += each;
				if (totalSum >= target) {
					break;
				}
			}
		}

		candidates = newCandidates.stream().mapToInt(Integer::intValue).toArray();
		List<List<Integer>> resp = new ArrayList<>();
		solve(0, candidates, resp, target, new ArrayList<Integer>(), 0);

		return resp;
	}

	private void solve(int start, int[] candidates, List<List<Integer>> resp, int target, List<Integer> list, int sum) {
		if (sum == target) {
			if (notAlready(resp, list)) {
				resp.add(new ArrayList<>(list));
			}
			return;
		}

		if (sum > target) {
			return;
		}
		
		for (int i = start + 1; i <= candidates.length; i++) {
			list.add(candidates[i - 1]);
			solve(i, candidates, resp, target, list, sum + candidates[i - 1]);
			list.remove(list.size() - 1);
			
			if(i< candidates.length && candidates[i - 1] == candidates[i]) {
				i++;
			}
		}
	}

	private boolean notAlready(List<List<Integer>> resp, List<Integer> list) {
		HashMap<Integer, Integer> count = null;
		for (List<Integer> each : resp) {
			count = new HashMap<Integer, Integer>();
			for (Integer eachInt : each) {
				Integer c = count.putIfAbsent(eachInt, 1);
				if (c != null) {
					count.put(eachInt, c + 1);
				}
			}

			for (Integer eachInt : list) {
				Integer c = count.putIfAbsent(eachInt, -1);
				if (c != null) {
					count.put(eachInt, c - 1);
				}
			}

			if (count.values().stream().allMatch(t -> t.equals(0))) {
				return false;
			}

		}

		return true;
	}
}