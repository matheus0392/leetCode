package dev.mnascimento0392.leetCode._20;

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (s.charAt(i) == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (s.charAt(i) == ']' && stack.peek() == '[') {
					stack.pop();
				} else if (s.charAt(i) == '}' && stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			}

		}
		if (stack.size() == 0) {
			return true;
		}

		return false;
	}
}