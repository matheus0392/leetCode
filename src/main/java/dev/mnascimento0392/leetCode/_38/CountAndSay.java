package dev.mnascimento0392.leetCode._38;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}

		String result = "1";

		for (int x = 1; x < n; x++) {

			result = rle(result);
		}

		return result;
	}

	/*
	 * private String recursive(int n) { if (n < 2) { return "1"; }
	 * 
	 * return rle(n) + recursive(n - 1); }
	 */

	private String rle(String result) {
		int len = result.length();

		if (len == 1) {
			return "1" + result;
		}

		// Map<Character, Integer> map = new LinkedHashMap<>();

		// char currentChar = result.charAt(0);
		StringBuilder sb = new StringBuilder();
		int count = 1;
		// char currentChar = result.charAt(0);
		for (int x = 0; x < len-1; x++) {
			if (result.charAt(x) != result.charAt(x + 1)) {
				sb.append(count);
				sb.append(result.charAt(x));
				count = 0;
			}
			count++;
			/*
			 * currentChar = result.charAt(x); Integer h = map.putIfAbsent(currentChar, 1);
			 * if (h != null) { map.put(currentChar, h + 1); }
			 */
		}

		/*
		 * for (Character key : map.keySet()) { sb.append(map.get(key)); sb.append(key);
		 * }
		 */
		
		sb.append(count);
		sb.append(result.charAt(len - 1));

		return sb.toString();
	}
}