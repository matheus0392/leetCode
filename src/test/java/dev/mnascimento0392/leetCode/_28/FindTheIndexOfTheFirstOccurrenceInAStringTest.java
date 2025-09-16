package dev.mnascimento0392.leetCode._28;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class FindTheIndexOfTheFirstOccurrenceInAStringTest extends TestFormatter {

	FindTheIndexOfTheFirstOccurrenceInAStringTest() {
		setQuestion("28. Find the Index of the First Occurrence in a String");
	}

		@Test
	void test01() {
		assertFormatted(new Solution().strStr("sadbutsad", "sad"), 0);
	}

	@Test
	void test02() {
		assertFormatted(new Solution().strStr("leetcode", "leeto"), -1);
	}
	
	@Test
	void test03() {
		assertFormatted(new Solution().strStr("leetcode", "code"), 4);
	}

	@Test
	void test04() {
		assertFormatted(new Solution().strStr("a", "a"), 0);
	}
	
	@Test
	void test05() {
		assertFormatted(new Solution().strStr("ab", "b"), 1);
	}
	
	@Test
	void test06() {
		assertFormatted(new Solution().strStr("ab", "c"), -1);
	}

	@Test
	void test07() {
		assertFormatted(new Solution().strStr("aaaaaaaab", "aab"), 6);
	}

	@Test
	void test08() {
		assertFormatted(new Solution().strStr("abcabcabcdd", "abcd"), 6);
	}

	@Test
	void test09() {
		assertFormatted(new Solution().strStr("aaa", "aaaa"), -1);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().strStr("mississippi", "issipi"), -1);
	}
	
	@Test
	void test11() {
		assertFormatted(new Solution().strStr("mississippi", "issippi"), 4);
	}
}
