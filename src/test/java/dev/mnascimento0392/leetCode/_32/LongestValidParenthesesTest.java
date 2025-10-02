package dev.mnascimento0392.leetCode._32;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class LongestValidParenthesesTest extends TestFormatter {

	LongestValidParenthesesTest() {
		setQuestion("32. Longest Valid Parentheses");
	}

		@Test
	void test1() {
		assertFormatted(new Solution().longestValidParentheses("(()"), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().longestValidParentheses(")()())"), 4);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().longestValidParentheses(""), 0);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().longestValidParentheses(")("), 0);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().longestValidParentheses("))"), 0);
	}
	
	@Test
	void test6() {
		assertFormatted(new Solution().longestValidParentheses("(("), 0);
	}
	
	
	@Test
	void test7() {
		assertFormatted(new Solution().longestValidParentheses("(()))"), 4);
	}
	
	@Test
	void test8() {
		assertFormatted(new Solution().longestValidParentheses("((())(()))"), 10);
	}
	
	@Test
	void test9() {
		assertFormatted(new Solution().longestValidParentheses("((())(())))"), 10);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().longestValidParentheses("(((())(()))"), 10);
	}
	
	@Test
	void test11() {
		assertFormatted(new Solution().longestValidParentheses("((())((())(()))"), 14);
	}
	
	@Test
	void test12() {
		assertFormatted(new Solution().longestValidParentheses("((())(())(()))"), 14);
	}
	
	@Test
	void test13() {
		assertFormatted(new Solution().longestValidParentheses("(((((("), 0);
	}
	
	@Test
	void test14() {
		assertFormatted(new Solution().longestValidParentheses("))))))"), 0);
	}
	
	@Test
	void test15() {
		assertFormatted(new Solution().longestValidParentheses(")())())()"), 2);
	}
	
	@Test
	void test16() {
		assertFormatted(new Solution().longestValidParentheses(")()()())("), 6);
	}
	
	
	@Test
	void test17() {
		assertFormatted(new Solution().longestValidParentheses("(((()((()))"), 8);
	}
	
	@Test
	void test18() {
		assertFormatted(new Solution().longestValidParentheses("(((()(((())"), 4);
	}
	
	@Test
	void test19() {
		assertFormatted(new Solution().longestValidParentheses("()((((()"), 2);
	}
}
