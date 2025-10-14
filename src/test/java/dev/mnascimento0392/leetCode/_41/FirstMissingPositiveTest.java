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

}
