package dev.mnascimento0392.leetCode._8;

class Solution {
	public int myAtoi(String s) {
		long resp = 0;
		boolean neg = false;

		s = s.trim();

		if (s.length() > 0 && s.charAt(0) == '-') {
			neg = true;
			s = s.substring(1);
		}

		if (!neg && s.length() > 0 && s.charAt(0) == '+') {
			s = s.substring(1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (!s.substring(i, i + 1).matches("\\d")) {
				s = s.substring(0, i);
				break;
			}
		}

		while (s.length() > 0 && s.charAt(0) == '0') {
			s = s.substring(1);
		}

		if (s.length() > 10) {
			if (neg) {
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
		}

		if (s.length() == 0) {
			return 0;
		}

		resp = Long.valueOf(s);
		if (neg) {
			resp = -resp;
		}

		if (resp > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		if (resp < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) resp;
	}
}