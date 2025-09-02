package dev.mnascimento0392.leetCode._14;

class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) {
			return strs[0];
		}

		int maxDepth = strs[0].length();

		String prefix = strs[0];

		for (int x = 1; x < strs.length; x++) {
			for (int y = 0; y < maxDepth; y++) {
				if (strs[x].length() > y) {
					if (prefix.charAt(y) != strs[x].charAt(y)) {
						maxDepth = maxDepth < y ? maxDepth : y;
						break;
					}
				} else {
					maxDepth = maxDepth < y ? maxDepth : y;
				}
			}
			if (maxDepth == 0) {
				break;
			}
		}

		return prefix.substring(0, maxDepth);
	}
}
