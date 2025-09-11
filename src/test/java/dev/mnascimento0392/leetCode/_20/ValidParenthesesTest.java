package dev.mnascimento0392.leetCode._20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ValidParenthesesTest extends TestFormatter {

	ValidParenthesesTest() {
		setQuestion("20. Valid Parentheses");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().isValid("()"), true);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().isValid("()[]{}"), true);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().isValid("(]"), false);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().isValid("([])"), true);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().isValid("([)]"), false);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().isValid("(("), false);
	}
	
	@Test
	void test7() {
		assertFormatted(new Solution().isValid("))"), false);
	}
	
	@Test
	void test8() {
		assertFormatted(new Solution().isValid("){"), false);
	}
}
