package dev.mnascimento0392.leetCode._9;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class PalindromeNumberTest {

	@BeforeAll
	void test() {
		System.err.println("9. Palindrome Number");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().isPalindrome(121), true);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().isPalindrome(-121), false);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().isPalindrome(10), false);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().isPalindrome(0), true);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().isPalindrome(-1), false);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().isPalindrome(23232), true);
	}
	
	@Test
	void test7() {
		assertFormatted(new Solution().isPalindrome(2332), true);
	}


}