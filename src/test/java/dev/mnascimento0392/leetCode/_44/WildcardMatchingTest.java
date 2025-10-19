package dev.mnascimento0392.leetCode._44;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class WildcardMatchingTest extends TestFormatter {

	WildcardMatchingTest() {
		setQuestion("44. Wildcard Matching");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().isMatch("aa", "a"), false);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().isMatch("aa", "*"), true);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().isMatch("cb", "?a"), false);
	}

}
