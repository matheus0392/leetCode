package dev.mnascimento0392.leetCode._12;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public String intToRoman(int num) {
		StringBuilder result = new StringBuilder();
		Map<Integer, String> map = new HashMap<>(14);
		Map<Integer, String> map_ = Map.of(1, "I", 4, "IV", 5, "V", 9, "IX", 10, "X", 40, "XL", 50, "L");
		Map<Integer, String> map__ = Map.of(90, "XC", 100, "C", 400, "CD", 500, "D", 900, "CM", 1000, "M");

		map_.forEach((k, v) -> {
			map.put(k, v);
		});
		map__.forEach((k, v) -> {
			map.put(k, v);
		});

		for (short i = (short) Math.log10(4000); i >= 0; i--) {
			short current = (short) ((short) (((short) (num / Math.pow(10, i))) * Math.pow(10, i))
					% Math.pow(10, i + 1));

			String currentLetter = map.get((int) current);
			if (currentLetter != null) {
				result.append(currentLetter);
			} else {
				short val = (short) (current / Math.pow(10, i));

				if (val >= 5 && val <= 8) {
					String currentLetter_ = map.get(5 * (int) (Math.pow(10, i)));
					if (currentLetter_ != null) {
						result.append(currentLetter_);
					}
					val -= 5;
				}

				for (int j = 0; j < val; j++) {
					String currentLetter_ = map.get((int) (Math.pow(10, i)));
					if (currentLetter_ != null) {
						result.append(currentLetter_);
					}
				}
			}

		}

		return result.toString();
	}
}