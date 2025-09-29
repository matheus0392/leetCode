package dev.mnascimento0392.leetCode._30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public List<Integer> findSubstring(String s, String[] words) {
		int len = words[0].length();
		int nwords = words.length;
		Map<Integer, Integer> map = new HashMap<>();
		HashMap<String, Integer> quantity = new HashMap<>();
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i <= s.length() - len; i++) {
			String sub = s.substring(i, i + len);
			Integer idx = hasSubString(sub, words, new ArrayList<Integer>());
			if (idx > -1) {
				map.put(i, idx);
			}
		}

		for (int i = 0; i < words.length; i++) {
			quantity.put(words[i], quantity.get(words[i]) != null ? quantity.get(words[i]) + 1 : 1);
		}

		for (int i = 0; i <= s.length() - len * nwords; i++) {

			Integer x = map.get(i);
			if (x != null) {
				HashMap<String, Integer> clone = (HashMap<String, Integer>) quantity.clone();
				boolean fail = false;

				for (int j = 0; j < nwords; j++) {
					Integer z = map.get(i + j * len);
					if (z == null) {
						fail = true;
						break;
					}
					Integer zz = clone.get(words[z]);
					if (zz == null) {
						fail = true;
						break;
					}
					if (zz == 1) {
						clone.remove(words[z]);
					}else {
						clone.put(words[z], zz - 1);						
					}
				}
				if (!fail) {
					result.add(i);
				}
			}
		}

		return result;
	}

	private int hasSubString(String sub, String[] words, List<Integer> excp) {
		for (int x = 0; x < words.length; x++) {
			if (excp.contains(x)) {
				continue;
			}
			if (sub.equals(words[x])) {
				return x;
			}
		}
		return -1;
	}
}