package dev.mnascimento0392.leetCode._1;

import static dev.mnascimento0392.leetCode.TesteFormatter.assertArrayFormatted;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void test1() {
		assertArrayFormatted(new Solution().twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 0, 1 });
	}

	@Test
	void test2() {
		assertArrayFormatted(new Solution().twoSum(new int[] { 3, 2, 4 }, 6), new int[] { 1, 2 });
	}

	@Test
	void test3() {
		assertArrayFormatted(new Solution().twoSum(new int[] { 3, 3 }, 6), new int[] { 0, 1 });
	}

}
