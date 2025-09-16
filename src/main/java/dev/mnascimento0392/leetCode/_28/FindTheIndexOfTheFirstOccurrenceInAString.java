package dev.mnascimento0392.leetCode._28;

class Solution {
	public int strStr(String haystack, String needle) {
		// return haystack.indexOf(needle);
		if (needle.length() > haystack.length()) {
			return -1;
		}

		int nextPoint = 0;
		char initial = needle.charAt(0);
		for (int i = 0; i < haystack.length(); i++) {
			if (i > haystack.length() - needle.length()) {
				return -1;
			}
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 0; j < needle.length(); j++) {
					char lookingChar = needle.charAt(j);
					char currentChar = haystack.charAt(i + j);
					if (initial == currentChar && 0 < j && nextPoint == 0) {
						nextPoint = i + j;
					}
					if (currentChar != lookingChar) {
						break;
					}
					if (j == needle.length() - 1) {
						return i;
					}
				}
			}
			i = nextPoint > 0 ? nextPoint - 1 : i;
			nextPoint = 0;
		}
		return -1;

	}
}