package dev.mnascimento0392.leetCode._3;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	void test1() {
		assertFormatted(new Solution().lengthOfLongestSubstring("abcabcbb"), 3);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().lengthOfLongestSubstring("bbbbb"), 1);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().lengthOfLongestSubstring("pwwkew"), 3);
	}

}
