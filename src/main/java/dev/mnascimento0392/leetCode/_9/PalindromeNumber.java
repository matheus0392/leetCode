package dev.mnascimento0392.leetCode._9;

class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x < 10) {
			return true;
		}

		int digits = (int) Math.ceil(Math.log10((double) x));

		if (x % Math.pow(10, digits) == 0) {
			digits += 1;
		}

		for (int i = 0; i < digits/2; i++) {
			int j = digits-i*2-1;
			if (!((int)(x / Math.pow(10, j)) == x % 10)) {
				return false;
			}
			x %= Math.pow(10, j);
			x /= 10;
		}

		return true;
	}
}