package dev.mnascimento0392.leetCode._32;

import java.util.Arrays;
import java.util.Stack;

class Solution {
	public int longestValidParentheses(String s) {
		if (s.length() < 2) {
			return 0;
		}

		while (s.startsWith(")")) {
			s = s.substring(1);
		}

		int len = s.length();

		Stack<Character> stack = new Stack<>();
		boolean[] valid = new boolean[len];
		Arrays.fill(valid, false);

		int resp = 0;
		int count = 0;
		for (int i = 0; i < len; i++) {

			if (stack.isEmpty()) {
				if (s.charAt(i) == '(') {
					stack.push('(');
				}

			} else {
				/*
				 * (s.charAt(i) == ')') { stack.push(')'); stack.push(')'); indx=i;
				 */
				if (s.charAt(i) == ')') {
					if (stack.peek() == '(') {
						stack.pop();
						valid[i] = true;
						for (int x = i; x >= 0; x--) {
							if (!valid[x]) {
								valid[x] = true;
								break;
							}
						}
					}
				} else {
					stack.push('(');
				}
			}
		}

		count = 0;
		for (int i = 0; i < valid.length; i++) {
			if (valid[i]) {
				count += 1;
				resp = Math.max(resp, count);
			} else {
				count = 0;
			}
		}

		return resp;

	}
}