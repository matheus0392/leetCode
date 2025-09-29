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

}
