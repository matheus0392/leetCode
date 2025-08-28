package dev.mnascimento0392.leetCode._10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class RegularExpressionMatchingTest extends TestFormatter {

	RegularExpressionMatchingTest() {
		setQuestion("10. Regular Expression Matching");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().isMatch("aa", "a"), false);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().isMatch("aa", "a*"), true);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().isMatch( "ab", ".*"), true);
	}

}