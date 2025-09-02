package dev.mnascimento0392.leetCode._14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class LongestCommonPrefixTest extends TestFormatter {

	LongestCommonPrefixTest() {
		setQuestion("14. Longest Common Prefix");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "flower", "flow", "flight" }), "fl");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "dog", "racecar", "car" }), "");
	}

	@Test
	void test3() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "" }), "");
	}

	@Test
	void test4() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "a" }), "a");
	}

	@Test
	void test5() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "aaa", "aaaaa", "aaaaab", "aaaaac" }), "aaa");
	}

	@Test
	void test6() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "ab", "a" }), "a");
	}

	@Test
	void test7() {
		assertFormatted(new Solution().longestCommonPrefix(new String[] { "a", "a", "c" }), "");
	}
}
