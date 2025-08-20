package dev.mnascimento0392.leetCode._3;

import java.util.HashSet;

class Solution {
	public int lengthOfLongestSubstring(String s) {

		int resp = 0;
		int length = s.length();

		HashSet<String> subs = new HashSet<>();

		for (int x = 0; x < length; x++) {
			for (int y = x + 1; y <= length; y++) {
				if (y - x > resp) {

					String sub = s.substring(x, y);
					if (isValid(sub)) {
						int current = sub.length();
						resp = resp > current ? resp : current;
					} else {
						x += 1;
						y = x + 1;
					}
				}
			}
		}

		return resp;
	}

	boolean isValid(String s) {
		for (int x = 0; x < s.length(); x++) {
			if (s.substring(x + 1).contains(s.substring(x, x + 1))) {
				return false;
			}
		}
		return true;
	}

}