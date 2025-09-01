package dev.mnascimento0392.leetCode._13;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<>(14);
		Map<String, Integer> map_ = Map.of("I", 1, "IV", 4, "V", 5, "IX", 9, "X", 10, "XL", 40, "L", 50);
		Map<String, Integer> map__ = Map.of("XC", 90, "C", 100, "CD", 400, "D", 500, "CM", 900, "M", 1000);

		map_.forEach((k, v) -> {
			map.put(k, v);
		});
		map__.forEach((k, v) -> {
			map.put(k, v);
		});

		int val = 0;

		while (s.length() > 0) {

			if (s.length() > 1) {
				if (map.containsKey(s.substring(0, 2))) {
					val += map.get(s.substring(0, 2));
					s = s.substring(1);
				} else {
					val += map.get(s.substring(0, 1));
				}
			} else {
				val += map.get(s.substring(0, 1));
			}
			s = s.substring(1);
		}

		return val;
	}
}