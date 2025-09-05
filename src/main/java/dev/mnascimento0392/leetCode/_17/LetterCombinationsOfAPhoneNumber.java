package dev.mnascimento0392.leetCode._17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0) {
			return List.of();
		}

		Map<Character, String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs",
				'8', "tuv", '9', "wxyz");
		List<String> in = new ArrayList<String>();

		for (int x = 0; x < digits.length(); x++) {
			in.add(map.get(digits.charAt(x)));
		}

		int totalLen = 1;
		for (String i : in) {
			totalLen *= i.length();
		}

		List<String> out = new ArrayList<String>(totalLen);
		for (int x = 0; x < totalLen; x++) {
			out.add("");
		}

		int factor=1;
		for (int x = 0; x < in.size(); x++) {
			String i = in.get(x);
			factor *= i.length();
			for (int y = 0; y < totalLen; y++) {
				//out.set(y, out.get(y) + i.charAt(((int) (y * Math.pow(in.size(), x)) / (in.size()*i.length())) % i.length()));
				out.set(y, out.get(y) + i.charAt((int) (y /(totalLen/factor)) % i.length()));
			}
		}
		/*y 1~36
		i.length()  4
		x  2
		each 9
		1~36 * 16) / (9)) % 4*/
		
		
		/*
		 * String i = in.get(in.size() - 1); for (int y = 0; y < totalLen; y++) {
		 * out.set(y, out.get(y) + i.charAt(y % i.length())); }
		 */

		return out;
	}
}