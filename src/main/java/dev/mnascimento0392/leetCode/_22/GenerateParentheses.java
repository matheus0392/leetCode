package dev.mnascimento0392.leetCode._22;

import java.util.ArrayList;
import java.util.List;

class Solution {

	List<String> lists = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		generatePossibilities("", n * 2);

		return lists;
	}

	Character[] generatePossibilities(String ch, int n) {
		if (n == 0) {
			if (isValid(ch)) {
				lists.add(ch);
			}
			return null;
		}

		String ch_open = ch + "(";
		generatePossibilities(ch_open, n - 1);

		String ch_close = ch + ")";
		generatePossibilities(ch_close, n - 1);
		return null;
	}

	private boolean isValid(String ch) {
		int count1 = 0;
		int count2 = 0;
		for (int x = 0; x < ch.length(); x++) {
			if (ch.charAt(x) == '(') {
				count1 += 1;
			}
			if (ch.charAt(x) == ')') {
				count2 += 1;
			}
			if (count2 > count1) {
				return false;
			}
		}
		if (count1 != ch.length() / 2) {
			return false;
		}

		return true;
	}
}