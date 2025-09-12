package dev.mnascimento0392.leetCode._22;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class GenerateParenthesesTest extends TestFormatter {

	GenerateParenthesesTest() {
		setQuestion("22. Generate Parentheses");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().generateParenthesis(3),
				List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().generateParenthesis(1), List.of("()"));
	}

}
