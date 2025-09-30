package dev.mnascimento0392.leetCode._31;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class NextPermutationTest extends TestFormatter {

	NextPermutationTest() {
		setQuestion("31. Next Permutation");
	}

	int[] input;

	@Test
	void test1() {
		input = new int[] { 1, 2, 3 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 3, 2 });
	}

	@Test
	void test2() {
		input = new int[] { 3, 2, 1 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 2, 3 });
	}

	@Test
	void test3() {
		input = new int[] { 1, 1, 5 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 5, 1 });
	}

	@Test
	void test4() {
		input = new int[] { 1, 4, 3, 2 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 2, 1, 3, 4 });
	}

	@Test
	void test5() {
		input = new int[] { 1, 2, 4, 3 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 3, 2, 4 });
	}

	@Test
	void test6() {
		input = new int[] { 4, 3, 2, 1 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 2, 3, 4 });
	}

	@Test
	void test7() {
		input = new int[] { 5, 4, 3, 2, 1 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 1, 2, 3, 4, 5 });
	}

	@Test
	void test8() {
		input = new int[] { 2, 3, 1 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 3, 1, 2 });
	}

	@Test
	void test9() {
		input = new int[] { 4, 2, 0, 2, 3, 2, 0 };
		new Solution().nextPermutation(input);
		assertArrayFormatted(input, new int[] { 4, 2, 0, 3, 0, 2, 2 });
	}
}
