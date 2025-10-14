package dev.mnascimento0392.leetCode._41;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class FirstMissingPositiveTest extends TestFormatter {

	FirstMissingPositiveTest() {
		setQuestion("41. First Missing Positive");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 1, 2, 0 }), 3);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 3, 4, -1, 1 }), 2);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }), 1);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 3, 2, 1, 0 }), 4);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { -1, -2, 0 }), 1);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { -1, -2 }), 1);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { -1, 1, -2 }), 2);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 1, 4, 3, 2, 5, 7, 9, 8, 10 }), 6);
	}

	@Test
	void test9() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { 1 }), 2);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().firstMissingPositive(new int[] { -1 }), 1);
	}
}
