package dev.mnascimento0392.leetCode._3;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class LongestSubstringWithoutRepeatingCharactersTest {

	@BeforeAll
	void test() {
		System.err.println("3. Longest Substring Without Repeating Characters Test");
	}


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
