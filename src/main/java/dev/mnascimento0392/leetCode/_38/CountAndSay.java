package dev.mnascimento0392.leetCode._38;

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

	private String rle(String result) {
		int len = result.length();

		if (len == 1) {
			return "1" + result;
		}

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int x = 0; x < len - 1; x++) {
			if (result.charAt(x) != result.charAt(x + 1)) {
				sb.append(count);
				sb.append(result.charAt(x));
				count = 0;
			}
			count++;
		}

		sb.append(count);
		sb.append(result.charAt(len - 1));

		return sb.toString();
	}
}