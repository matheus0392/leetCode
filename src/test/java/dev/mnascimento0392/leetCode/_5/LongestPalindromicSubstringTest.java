package dev.mnascimento0392.leetCode._5;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class LongestPalindromicSubstringTest {

	@BeforeAll
	void test() {
		System.err.println("5. Longest Palindromic Substring");
	}


	@Test
	void test1() {
		assertFormatted(new Solution().longestPalindrome("babad"), "bab");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().longestPalindrome("cbbd"), "bb");
	}
	
	@Test
	void test3() {
		assertFormatted(new Solution().longestPalindrome("a"), "a");
	}



}
