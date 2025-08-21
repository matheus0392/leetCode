package dev.mnascimento0392.leetCode._5;

class Solution {
	public String longestPalindrome(String s) {

		String result = "";
		for (int x = 0; x < s.length(); x++) {

			for (int y = x; y <= s.length(); y++) {
				String sub = s.substring(x, y);
				if(isPalindrome(sub)) {
					
				result = sub.length() > result.length() ? sub : result;
				if (y < result.length()) {
					y = result.length();
				}
				if (y > s.length()) {
					break;
				}
			}
			}

		}

		return result;
	}

	boolean isPalindrome(String s) {
		if (s.length() > 1) {
			if (s.length() % 2 == 0) {
				for (int x = 0; x < s.length() / 2; x++) {
					if (!(s.charAt(s.length() / 2 - x - 1) == s.charAt(s.length() / 2 + x))) {
						return false;
					}
				}
			} else {
				for (int x = 0; x <= s.length() / 2; x++) {
					if (!(s.charAt(s.length() / 2 - x) == s.charAt(s.length() / 2 + x))) {
						return false;
					}
				}
			}
		}
		return true;
	}
}