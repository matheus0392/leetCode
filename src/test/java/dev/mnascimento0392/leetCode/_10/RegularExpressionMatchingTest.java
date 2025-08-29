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
		assertFormatted(new Solution().isMatch("ab", ".*"), true);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().isMatch("abbbb", ".*"), true);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().isMatch("a", ".*"), true);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().isMatch("aab", "c*a*b"), true);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().isMatch("aaa", "aaaa"), false);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().isMatch("aaa", "a*a"), true);
	}

	@Test
	void test9() {
		assertFormatted(new Solution().isMatch("aaa", "ab*a*c*a"), true);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().isMatch("a", "ab*"), true);
	}
	
	@Test
	void test11() {
		assertFormatted(new Solution().isMatch("bbbba", ".*a*a"), true);
	}
	
	@Test
	void test12() {
		assertFormatted(new Solution().isMatch("mississippi", "mis*is*p*."), false);
	}
	
	@Test
	void test13() {
		assertFormatted(new Solution().isMatch("aab", ".*a*aa*.*b*.c*.*a*"), true);
	}
	
	@Test
	void test14() {
		assertFormatted(new Solution().isMatch("abbaab",".*b.a.*c*"), true);
	}
	
	@Test
	void test0() {
		assertFormatted(new Solution().isMatch("abbabaaaaaaacaa","a*.*b.a.*c*b*a*c*"), true);
	}
}